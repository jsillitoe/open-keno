package org.jsillitoe.casino.keno.ticket;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DefaultTicketTest {

	private Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ticket = new DefaultTicket();
	}

	@After
	public void tearDown() throws Exception {
		ticket = null;
	}

	@Test
	public void test_spots_1_to_80_valid() {
		for (int x=1;x<=80;x++){
			assertTrue(ticket.isValidMark(x));
		}
	}
	
	@Test
	public void test_spots_0_invalid() {
		assertFalse(ticket.isValidMark(0));
	}

	@Test
	public void test_spots_81_invalid() {
		assertFalse(ticket.isValidMark(81));
	}
	
	@Test(expected = TicketException.class)  
	public void test_invalid_spot_throws_ticketexception() throws TicketException {
		ticket.markNumber(0);
	}
	
	@Test
	public void test_spot_registered() throws TicketException {
		ticket.markNumber(4);
		assertEquals(1,ticket.countMarks());
	}
	
	@Test
	public void test_spot_unregistered() throws TicketException {
		ticket.markNumber(4);
		ticket.unMarkNumber(4);
		assertEquals(0,ticket.countMarks());
	}
	
	@Test
	public void test_duplicate_spot_not_registered() throws TicketException {
		ticket.markNumber(4);
		ticket.markNumber(4);
		assertEquals(1,ticket.countMarks());
	}
	
	
	
	
}
