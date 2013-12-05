package org.jsillitoe.casino.keno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jsillitoe.casino.keno.balls.BallProviderException;
import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.balls.DefaultBallProvider;
import org.jsillitoe.casino.keno.paytable.DefaultPayTableProvider;
import org.jsillitoe.casino.keno.paytable.PayTable;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.race.RaceResult;
import org.jsillitoe.casino.keno.race.StandardRaceResult;
import org.jsillitoe.casino.keno.ticket.Ticket;

public class StandardKeno extends Keno {

	public StandardKeno() {
		this.setPayTableProvider(new DefaultPayTableProvider());
		this.setBallProvider(new DefaultBallProvider(new Random()));
	}

	@Override
	public RaceResult playTicket(Ticket ticket) throws KenoException {
		try{
			Balls balls = this.ballProvider.getBalls();
			PayTable paytable = this.payTableProvider.getPayTable(balls.getCaughtCount(ticket));
			return new StandardRaceResult(balls, ticket, paytable);
		}catch(BallProviderException bpe){
			throw new KenoException(bpe);
		}catch(PayTableException pte){
			throw new KenoException(pte);
		}
	}

	@Override
	public List<RaceResult> playMultipleTickets(List<Ticket> tickets) throws KenoException {
		try{
			List<RaceResult> results = new ArrayList<RaceResult>();
			Balls balls = this.ballProvider.getBalls();
			for(Ticket ticket : tickets){
				PayTable paytable = this.payTableProvider.getPayTable(balls.getCaughtCount(ticket));
				results.add(new StandardRaceResult(balls, ticket, paytable));
			}
			return results;
		}catch(BallProviderException bpe){
			throw new KenoException(bpe);
		}catch(PayTableException pte){
			throw new KenoException(pte);
		}
	}

}
