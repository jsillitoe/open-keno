package org.jsillitoe.casino.keno.ticket;

import java.util.HashSet;
import java.util.Set;

import org.jsillitoe.casino.keno.ticket.exception.TicketException;


public abstract class AbstractTicket implements Ticket {

	protected Set<Integer> marks = new HashSet<Integer>();
	
	public int countMarks() {
		return marks.size();
	}

	public Set<Integer> getMarks() {
		return new HashSet<Integer>(marks);
	}

	public void markNumber(int number) throws TicketException {
		if (isValidMark(number)){
			marks.add(number);
		}else{
			throw new TicketException("Invalid number to mark: "+number);
		}
	}

	public void markNumber(String number) throws TicketException {
		markNumber(Integer.parseInt(number));
	}

	public void unMarkNumber(int number){
		marks.remove(number);
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
