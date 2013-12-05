package org.jsillitoe.casino.keno.ticket;

import java.util.List;
import java.util.Set;

import org.jsillitoe.casino.keno.ticket.exception.TicketException;

public interface Ticket{

	/**
	 * Count the number of marks on this ticket.
	 * @return the number of marks added to the ticket.
	 */
	public int countMarks();
	
	
	/**
	 * Get the set of numbers marked.
	 * @return a set of marks.
	 */
	public Set<Integer> getMarks();
	
	/**
	 * TODO
	 * 
	 * @param number
	 * @return
	 */
	public boolean isValidMark(int number);
	
	/**
	 * TODO
	 * 
	 * @param number
	 * @return
	 */
	public boolean isValidMark(String number);
	
	
	/**
	 * Marks the number on the ticket.
	 * @param number An integer between 1 and 80 (inclusive).
	 * @throws TicketException 
	 */
	public void markNumber(int number) throws TicketException;
	
	
	/**
	 * Marks the number on the ticket.
	 * @param number A string representation of a number that will parse to an integer between 1 and 80 inclusive.
	 * @throws TicketException
	 */
	public void markNumber(String number) throws TicketException;
	
	
	/**
	 * Unmarks the number on the ticket.  If the number is not already marked, does nothing.
	 * @param number An integer between 1 and 80 (inclusive).
	 */
	public void unMarkNumber(int number);
	
	
	/**
	 * Unmarks the number on the ticket.  If the number is not already marked, does nothing.
	 * @param number A string representation of a number that will parse to an integer between 1 and 80 inclusive.
	 */
	public void unMarkNumber(String number);
	

	
}
