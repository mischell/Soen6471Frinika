package com.frinika.sequencer.gui.pianoroll;

import java.util.Vector;
import com.frinika.project.ProjectContainer;
import com.frinika.project.gui.ProjectFrame;
import com.frinika.sequencer.gui.IClient;
import com.frinika.sequencer.gui.Item;
import com.frinika.sequencer.gui.ItemPanel;
import com.frinika.sequencer.gui.ItemScrollPane;
import com.frinika.sequencer.model.MultiEvent;

abstract public class ClientRequest extends ItemPanel{

	
	private static final long serialVersionUID = 1L;

	Vector<MultiEvent> notesUnder;

	MultiEvent dragEvent;


	Iterable<MultiEvent> eventsInFocus;
	final ProjectContainer project;

	public ClientRequest(final ProjectContainer project, ItemScrollPane scroller,boolean hasTimeLine, boolean canScrollY, double d, boolean b) {
		super(project,scroller, hasTimeLine, canScrollY,.5,false);
		this.project = project;
	}
	
	@Override
	public void clientNotifySelectionChange() {
		this.project.getPartSelection().notifyListeners();	
	}
		
	@Override
	public void clientAddToSelection(Item item) {
		project.getMultiEventSelection().addSelected((MultiEvent) item);
		project.getMultiEventSelection().notifyListeners();
	}

	@Override
	public void clientRemoveFromSelection(Item item) {
		project.getMultiEventSelection().removeSelected((MultiEvent) item);
		project.getMultiEventSelection().notifyListeners();
	}

	@Override
	public void clientClearSelection() {
		project.getMultiEventSelection().clearSelection();
	}
	
}


