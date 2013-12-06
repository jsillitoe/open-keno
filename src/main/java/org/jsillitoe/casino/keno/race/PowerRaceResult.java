package org.jsillitoe.casino.keno.race;

import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * Race result for use with Power Bingo.
 */
public class PowerRaceResult extends RaceResult {

	//TODO: Document me.
	public static final int CATCH_20TH_MULTIPLIER = 4;
	
	
	/**
	 * TODO: Document me.
	 */
	public PowerRaceResult(Balls balls, Ticket ticket, PayTable paytable) {
		super(balls, ticket, paytable);
	}

	
	/**
	 * TODO: Document me.
	 */
	@Override
	public int getPayout() throws PayTableException {
		int caught = balls.getCaughtCount(ticket);
		int payout = paytable.getPays(caught);
		
		//Check to see if the player caught the 20th ball drawn.
		int lastBall = balls.getBallList().get(balls.getBallList().size() - 1);// number on the last ball.
		if (ticket.getMarks().contains(lastBall)){
			payout = payout * CATCH_20TH_MULTIPLIER;
		}
		
		return payout;
	}

}
