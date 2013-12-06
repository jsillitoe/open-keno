package org.jsillitoe.casino.keno.balls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsillitoe.casino.keno.ticket.Ticket;

/**
 * An ArrayList backed collection of balls drawn for a single keno race.
 */
public class Balls {

	private List<Integer> balls = new ArrayList<Integer>();
	
	/**
	 * TODO: Document me.
	 */
	public Balls(List<Integer> numbers) {
		balls = numbers;
	}
	

	/**
	 * TODO: Document me.
	 */
	public List<Integer> getBallList(){
		return new ArrayList<Integer>(balls);
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public final int getCaughtCount (Ticket ticket){
		Set<Integer> marks = new HashSet<Integer>(ticket.getMarks());
		marks.retainAll(balls);
		return marks.size();
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public final List<Integer> getCaughtList(Ticket ticket){
		List<Integer> marks = new ArrayList<Integer>(ticket.getMarks());
		marks.retainAll(balls);
		return marks;
	}

}
