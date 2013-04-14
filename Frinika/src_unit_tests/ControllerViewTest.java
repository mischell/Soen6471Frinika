import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import com.frinika.sequencer.gui.pianoroll.NoteOnScreenIterator;
import com.frinika.sequencer.gui.pianoroll.NoteOnScreenCollection;
import com.frinika.project.ProjectContainer;
import com.frinika.project.gui.ProjectFrame;
import com.frinika.sequencer.gui.ItemScrollPane;
import com.frinika.sequencer.gui.pianoroll.ControllerHandle;
import com.frinika.sequencer.gui.pianoroll.ControllerView;
import com.frinika.sequencer.gui.pianoroll.PianoControllerSplitPane;

import static org.junit.Assert.*;

import org.junit.Test;


public class ControllerViewTest {

	@Test
	public void TestNoteOnScreenCollection() throws Exception
	{
		NoteOnScreenCollection collection = new NoteOnScreenCollection(new ProjectContainer());
		assertNotNull(collection);
	}
	
	
	@Test
	public void TestNoteOnScreenIterator() throws Exception
	{

		NoteOnScreenIterator iter = new NoteOnScreenIterator(new ProjectContainer()); 
	    assertFalse(iter.hasNext());
	    assertNotNull(iter);

	}
	
	@Test
	public void validateControllerViewInner() throws Exception
	{
		ProjectFrame frame = new ProjectFrame(new ProjectContainer());
		PianoControllerSplitPane scroller = new PianoControllerSplitPane(frame);
		ControllerView view = new ControllerView(frame, scroller);
		assertNotNull(view);
		
		
	}

}
