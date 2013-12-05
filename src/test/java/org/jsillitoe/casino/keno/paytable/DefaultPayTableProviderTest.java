package org.jsillitoe.casino.keno.paytable;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DefaultPayTableProviderTest {

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
		PayTableProvider provider = new DefaultPayTableProvider();
		assertEquals(10,provider.getPayTableMap().size());
	}
	
	@Test
	public void test_provider_reports_max_supported_marks_10() throws IOException {
		PayTableProvider provider = new DefaultPayTableProvider();
		assertEquals(10,provider.getMaxSupportedMarks());
	}
	
	@Test
	public void test_provider_loads_one_mark_paytable() throws IOException, PayTableException {
		PayTableProvider provider = new DefaultPayTableProvider();
		PayTable table = provider.getPayTable(1);
		assertEquals(2,table.getPaysMap().size());
	}
	
	@Test
	public void test_provider_loads_one_mark_payout() throws IOException, PayTableException {
		PayTableProvider provider = new DefaultPayTableProvider();
		PayTable table = provider.getPayTable(1);
		assertEquals(3,table.getPays(1));
	}


}
