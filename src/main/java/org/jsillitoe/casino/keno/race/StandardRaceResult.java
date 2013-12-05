package org.jsillitoe.casino.keno.race;

import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.ticket.Ticket;

public class StandardRaceResult extends RaceResult {

	public StandardRaceResult(Balls balls, Ticket ticket, PayTable paytable) {
		super(balls, ticket, paytable);
	}

	@Override
	public int getPayout() throws PayTableException {
		int caught = balls.getCaughtCount(ticket);
		return paytable.getPays(caught);
	}

}
