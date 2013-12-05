package org.jsillitoe.casino.keno.balls;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DefaultBallProvider implements BallProvider {

	private static final int BALL_COUNT = 20;
	
	protected Random random;
	
	public DefaultBallProvider(Random random) {
		this.random = random;
	}

	public Balls getBalls() {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ballList = this.getAvailBalls();
		for (int x=0;x<BALL_COUNT;x++){
			numbers.add(ballList.remove(random.nextInt(ballList.size())));
		}
		return new Balls(numbers);
	}

	private List<Integer> getAvailBalls(){
		List<Integer> ballList = new ArrayList<Integer>();
		for (int x=1;x<=80;x++){
			ballList.add(x);
		}
		return ballList;
	}
	
}
