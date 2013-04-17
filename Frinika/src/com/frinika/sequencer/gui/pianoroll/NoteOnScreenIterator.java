package com.frinika.sequencer.gui.pianoroll;

import java.util.Iterator;

import com.frinika.project.ProjectContainer;
import com.frinika.sequencer.model.MidiPart;
import com.frinika.sequencer.model.MultiEvent;
import com.frinika.sequencer.model.Part;

public class NoteOnScreenIterator implements Iterator<MultiEvent> {

	Iterator<Part> partIter = null;

	Iterator<MultiEvent> noteIter = null;

	public NoteOnScreenIterator(ProjectContainer project) {
		partIter = project.getPartSelection().getSelected().iterator();
		advanceToNextMidiPart();
	}
	
	
	private boolean advanceToNextMidiPart() {

		Part part = null;

		while (partIter.hasNext()) {
			part = partIter.next();
			if (part instanceof MidiPart) {
				noteIter = ((MidiPart) part).getMultiEvents().iterator();
				return true;
			}
		}
		noteIter = null;
		return false;
	}

	public boolean hasNext() {
		if (noteIter == null)
			return false;
		if (noteIter.hasNext())
			return true;

		// TODO Auto-generated method stub
		return advanceToNextMidiPart();
	}

	public MultiEvent next() {
		if (noteIter.hasNext()) {
			MultiEvent ev = noteIter.next();
			return ev;
		}

		// He he sneak a bit of recursion in here (PJL)
		if (advanceToNextMidiPart())
			return next();
		return null;
	}

	public void remove() {
		assert (false);
		// TODO Auto-generated method stub
	}

}