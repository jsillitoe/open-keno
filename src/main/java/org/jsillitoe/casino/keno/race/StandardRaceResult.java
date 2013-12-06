package org.jsillitoe.casino.keno.race;

import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * TODO: Document me.
 */
public class StandardRaceResult extends RaceResult {

	/**
	 * TODO: Document me.
	 */
	public StandardRaceResult(Balls balls, Ticket ticket, PayTable paytable) {
		super(balls, ticket, paytable);
	}

	
	/**
	 * TODO: Document me.
	 */
	@Override
	public int getPayout() throws PayTableException {
		int caught = balls.getCaughtCount(ticket);
		return paytable.getPays(caught);
	}

}
