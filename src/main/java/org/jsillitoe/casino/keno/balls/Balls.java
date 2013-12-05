package org.jsillitoe.casino.keno.balls;

import java.util.ArrayList;
import java.util.List;

import org.jsillitoe.casino.keno.ticket.Ticket;

public class Balls {

	private List<Integer> balls = new ArrayList<Integer>();
	
	public Balls(List<Integer> numbers) {
		balls = numbers;
	}

	public List<Integer> getBallList(){
		return new ArrayList<Integer>(balls);
	}
	
	public final int getCaughtCount (Ticket ticket){
		//TODO Compare to count matches.
		return 0;
	}
	
	public final List<Integer> getCaughtList(Ticket ticket){
		//TODO Compare to get matches.
		return new ArrayList<Integer>();
	}
	
	
}
