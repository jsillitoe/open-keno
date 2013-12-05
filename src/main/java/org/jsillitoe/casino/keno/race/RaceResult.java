package org.jsillitoe.casino.keno.race;

import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.ticket.Ticket;

public abstract class RaceResult {

	protected Balls balls;
	protected Ticket ticket;
	protected PayTable paytable;
	
	public RaceResult(Balls balls, Ticket ticket, PayTable paytable) {
		this.balls = balls;
		this.ticket = ticket;
		this.paytable = paytable;
	}

	public Balls getBalls() {
		return balls;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public PayTable getPaytable() {
		return paytable;
	}

	public abstract int getPayout() throws PayTableException;

}
