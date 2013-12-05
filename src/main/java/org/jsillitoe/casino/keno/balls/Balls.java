package org.jsillitoe.casino.keno.balls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		Set<Integer> marks = new HashSet<Integer>(ticket.getMarks());
		marks.retainAll(balls);
		return marks.size();
	}
	
	public final List<Integer> getCaughtList(Ticket ticket){
		List<Integer> marks = new ArrayList<Integer>(ticket.getMarks());
		marks.retainAll(balls);
		return marks;
	}
	
	
}
