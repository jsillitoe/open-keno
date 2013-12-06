package org.jsillitoe.casino.keno;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.jsillitoe.casino.keno.balls.BallProvider;
import org.jsillitoe.casino.keno.balls.BallProviderException;
import org.jsillitoe.casino.keno.balls.Balls;
import org.jsillitoe.casino.keno.paytable.PayTableException;
import org.jsillitoe.casino.keno.race.RaceResult;
import org.jsillitoe.casino.keno.ticket.DefaultTicket;
import org.jsillitoe.casino.keno.ticket.Ticket;
import org.jsillitoe.casino.keno.ticket.TicketException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerKenoTest {

	private Keno keno;
	private static BallProvider staticBallProvider;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		staticBallProvider = new BallProvider(){
			public Balls getBalls() throws BallProviderException {
				List<Integer> numbers = new ArrayList<Integer>();
				for (int x=0;x<20;x++){
					numbers.add(x+1);
				}
				return new Balls(numbers);
			}
		};
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		keno = new PowerKeno(staticBallProvider);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_single_ticket_mark_1_hit_0() throws KenoException, TicketException, PayTableException {
		Ticket ticket = new DefaultTicket();
		ticket.markNumber(25);
		RaceResult result = keno.playTicket(ticket);
		assertEquals(0,result.getPayout());
		assertEquals(0,result.getBalls().getCaughtCount(result.getTicket()));
	}

	
	@Test
	public void test_single_ticket_mark_1_hit_1() throws KenoException, TicketException, PayTableException {
		Ticket ticket = new DefaultTicket();
		ticket.markNumber(10);
		RaceResult result = keno.playTicket(ticket);
		assertEquals(1,result.getBalls().getCaughtCount(result.getTicket()));
		assertEquals(3,result.getPayout());
		
	}
	
	
	@Test
	public void test_single_ticket_mark_1_hit_1_catch_lastball() throws KenoException, TicketException, PayTableException {
		Ticket ticket = new DefaultTicket();
		ticket.markNumber(20);
		RaceResult result = keno.playTicket(ticket);
		assertEquals(1,result.getBalls().getCaughtCount(result.getTicket()));
		assertEquals(12,result.getPayout());
		
	}
	
}
