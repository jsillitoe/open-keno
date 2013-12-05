package org.jsillitoe.casino.keno.paytable;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CSVPayTableProviderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_provider_loads_entire_paytable() throws IOException {
		PayTableProvider provider = new CSVPayTableProvider();
		assertEquals(provider.getPayTableMap().size(),20);
	}
	
	@Test
	public void test_provider_loads_one_mark_paytable() throws IOException, PayTableException {
		PayTableProvider provider = new CSVPayTableProvider();
		PayTable table = provider.getPayTable(1);
		assertEquals(table.getPaysMap().size(),2);
	}
	
	@Test
	public void test_provider_loads_one_mark_payout() throws IOException, PayTableException {
		PayTableProvider provider = new CSVPayTableProvider();
		PayTable table = provider.getPayTable(1);
		assertEquals(table.getPays(1), 3);
	}

}
