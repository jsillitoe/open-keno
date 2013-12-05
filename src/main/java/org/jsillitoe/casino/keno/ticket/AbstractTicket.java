package org.jsillitoe.casino.keno.ticket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public abstract class AbstractTicket implements Ticket {

	protected Set<Integer> marks = new HashSet<Integer>();
	
	protected List<TicketListener> listeners = new ArrayList<TicketListener>();
	
	
	public void addTicketListener(TicketListener listener) {
		listeners.add(listener);
	}

	public void removeTicketListener(TicketListener listener) {
		listeners.remove(listener);
	}
	
	public void clearTicketListeners() {
		listeners.clear();
	}
	
	public int countMarks() {
		return marks.size();
	}

	public Set<Integer> getMarks() {
		return new HashSet<Integer>(marks);
	}

	public void markNumber(int number) throws TicketException {
		if (isValidMark(number)){
			if(marks.add(number)){
				for(TicketListener listener : listeners){
					listener.onTicketMarked(number);
				}
			}
		}else{
			throw new TicketException("Invalid number to mark: "+number);
		}
	}

	public void markNumber(String number) throws TicketException {
		markNumber(Integer.parseInt(number));
	}

	public void unMarkNumber(int number){
		if(marks.remove(number)){
			for(TicketListener listener : listeners){
				listener.onTicketUnMarked(number);
			}
		}
	}

	public void unMarkNumber(String number){
		unMarkNumber(Integer.parseInt(number));
	}

	public final boolean isValidMark(int number){
		return number >= 1 && number <= 80;
	}
	
	public final boolean isValidMark(String number){
		return isValidMark(Integer.parseInt(number));
	}

}
