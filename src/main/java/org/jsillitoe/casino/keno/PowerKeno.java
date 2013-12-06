package org.jsillitoe.casino.keno;

import java.util.ArrayList;
import java.util.List;

import org.jsillitoe.casino.keno.balls.BallProvider;
import org.jsillitoe.casino.keno.balls.BallProviderException;
import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.paytable.PayTableProvider;
import org.jsillitoe.casino.keno.race.PowerRaceResult;
import org.jsillitoe.casino.keno.race.RaceResult;
import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * TODO: Document me.
 */
public class PowerKeno extends Keno {

	/**
	 * TODO: Document me.
	 */
	public PowerKeno() {
		super();
	}
	

	/**
	 * TODO: Document me.
	 */
	public PowerKeno(BallProvider ballprovider,	PayTableProvider paytableprovider) {
		super(ballprovider, paytableprovider);
	}

	
	/**
	 * TODO: Document me.
	 */
	public PowerKeno(BallProvider ballprovider) {
		super(ballprovider);
	}

	
	/**
	 * TODO: Document me.
	 */
	public PowerKeno(PayTableProvider paytableprovider) {
		super(paytableprovider);
	}

	
	/**
	 * TODO: Document me.
	 */
	@Override
	public RaceResult playTicket(Ticket ticket) throws KenoException {
		try{
			Balls balls = this.ballProvider.getBalls();
			PayTable paytable = this.payTableProvider.getPayTable(ticket.countMarks());
			return new PowerRaceResult(balls, ticket, paytable);
		}catch(BallProviderException bpe){
			throw new KenoException(bpe);
		}catch(PayTableException pte){
			throw new KenoException(pte);
		}
	}

	
	/**
	 * TODO: Document me.
	 */
	@Override
	public List<RaceResult> playMultipleTickets(List<Ticket> tickets) throws KenoException {
		try{
			List<RaceResult> results = new ArrayList<RaceResult>();
			Balls balls = this.ballProvider.getBalls();
			for(Ticket ticket : tickets){
				PayTable paytable = this.payTableProvider.getPayTable(ticket.countMarks());
				results.add(new PowerRaceResult(balls, ticket, paytable));
			}
			return results;
		}catch(BallProviderException bpe){
			throw new KenoException(bpe);
		}catch(PayTableException pte){
			throw new KenoException(pte);
		}
	}

}
