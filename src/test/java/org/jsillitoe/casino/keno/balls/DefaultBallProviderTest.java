package org.jsillitoe.casino.keno.balls;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DefaultBallProviderTest {

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
	public void test_provider_returns_20_balls() {
		DefaultBallProvider provider = new DefaultBallProvider(new Random());
		assertEquals(20,provider.getBalls().getBallList().size());
	}

}
