package org.jsillitoe.casino.keno.race;

import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * TODO: Document me.
 */
public abstract class RaceResult {

	protected Balls balls;
	protected Ticket ticket;
	protected PayTable paytable;
	
	
	/**
	 * TODO: Document me.
	 */
	@SuppressWarnings("unused")
	private RaceResult(){}
	
	
	/**
	 * TODO: Document me.
	 */
	public RaceResult(Balls balls, Ticket ticket, PayTable paytable) {
		this.balls = balls;
		this.ticket = ticket;
		this.paytable = paytable;
	}

	
	/**
	 * TODO: Document me.
	 */
	public Balls getBalls() {
		return balls;
	}

	
	/**
	 * TODO: Document me.
	 */
	public Ticket getTicket() {
		return ticket;
	}

	
	/**
	 * TODO: Document me.
	 */
	public PayTable getPaytable() {
		return paytable;
	}

	
	/**
	 * TODO: Document me.
	 */
	public abstract int getPayout() throws PayTableException;

}
