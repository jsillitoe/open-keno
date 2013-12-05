package org.jsillitoe.casino.keno.ticket.exception;

public class TicketException extends Exception{

	/**
	 * Default serial version id.
	 */
	private static final long serialVersionUID = 1L;

	public TicketException(Throwable cause) {
		super(cause);
	}

	public TicketException(String message) {
		super(message);
	}
	
}
