package org.jsillitoe.casino.keno;

import java.util.List;
import java.util.Random;

import org.jsillitoe.casino.keno.balls.BallProvider;
import org.jsillitoe.casino.keno.balls.DefaultBallProvider;
import org.jsillitoe.casino.keno.paytable.DefaultPayTableProvider;
import org.jsillitoe.casino.keno.paytable.PayTableProvider;
import org.jsillitoe.casino.keno.race.RaceResult;
import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * TODO: Document me.
 */
public abstract class Keno {

	// TODO: Document me.
	protected BallProvider ballProvider;
	
	// TODO: Document me.
	protected PayTableProvider payTableProvider;
	
	
	/**
	 * Constructor - Standard keno with the default paytable and ball provider.
	 */
	public Keno() {
		this.setPayTableProvider(new DefaultPayTableProvider());
		this.setBallProvider(new DefaultBallProvider(new Random()));
	}

	
	/**
	 * Constructor - Standard keno with the default paytable and a custom ball provider.
	 */
	public Keno(BallProvider ballprovider) {
		this.setPayTableProvider(new DefaultPayTableProvider());
		this.setBallProvider(ballprovider);
	}
	
	
	/**
	 * Constructor - Standard keno with the custom paytable and default ball provider.
	 */
	public Keno(PayTableProvider paytableprovider) {
		this.setPayTableProvider(paytableprovider);
		this.setBallProvider(new DefaultBallProvider(new Random()));
	}
	
	
	/**
	 * Constructor - Standard keno with the custom paytable and ball provider.
	 */
	public Keno(BallProvider ballprovider, PayTableProvider paytableprovider) {
		this.setPayTableProvider(paytableprovider);
		this.setBallProvider(ballprovider);
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public abstract RaceResult playTicket(Ticket ticket) throws KenoException;
	
	
	/**
	 * TODO: Document me.
	 */
	public abstract List<RaceResult> playMultipleTickets(List<Ticket> tickets) throws KenoException;
	
	
	/**
	 * TODO: Document me.
	 */
	public final BallProvider getBallProvider() {
		return ballProvider;
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public final void setBallProvider(BallProvider ballProvider) {
		this.ballProvider = ballProvider;
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public final PayTableProvider getPayTableProvider() {
		return payTableProvider;
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public final void setPayTableProvider(PayTableProvider payTableProvider) {
		this.payTableProvider = payTableProvider;
	}
	
}
