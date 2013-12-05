package org.jsillitoe.casino.keno;

import java.util.List;

import org.jsillitoe.casino.keno.balls.BallProvider;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.paytable.PayTableProvider;
import org.jsillitoe.casino.keno.race.RaceResult;
import org.jsillitoe.casino.keno.ticket.Ticket;

public abstract class Keno {

	protected BallProvider ballProvider;
	protected PayTableProvider payTableProvider;
	
	public abstract RaceResult playTicket(Ticket ticket) throws KenoException;
	
	public abstract List<RaceResult> playMultipleTickets(List<Ticket> tickets) throws KenoException;
	
	public final BallProvider getBallProvider() {
		return ballProvider;
	}
	
	public final void setBallProvider(BallProvider ballProvider) {
		this.ballProvider = ballProvider;
	}
	
	public final PayTableProvider getPayTableProvider() {
		return payTableProvider;
	}
	
	public final void setPayTableProvider(PayTableProvider payTableProvider) {
		this.payTableProvider = payTableProvider;
	}
	
}
