package org.jsillitoe.casino.keno.ticket;

public interface TicketListener {

	public void onTicketMarked(int number);
	
	public void onTicketUnMarked(int number);
	
}
