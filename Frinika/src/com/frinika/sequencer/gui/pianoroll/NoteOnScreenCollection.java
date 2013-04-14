package com.frinika.sequencer.gui.pianoroll;

import java.util.Collection;
import java.util.Iterator;

import com.frinika.project.ProjectContainer;
import com.frinika.sequencer.gui.pianoroll.NoteOnScreenIterator;
import com.frinika.sequencer.model.MultiEvent;

public class NoteOnScreenCollection implements Collection<MultiEvent> {

	protected ProjectContainer project;
	public NoteOnScreenCollection(ProjectContainer project){
		this.project = project;
		
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<MultiEvent> iterator() {
		return new NoteOnScreenIterator(project);
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(MultiEvent o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends MultiEvent> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

}
