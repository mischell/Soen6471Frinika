package com.frinika.sequencer.gui;


public interface IClient {
	
	public abstract void clientAddToSelection(Item item);
    public abstract void clientRemoveFromSelection(Item item);
    public abstract void clientNotifySelectionChange();
    public abstract void clientClearSelection();

}
