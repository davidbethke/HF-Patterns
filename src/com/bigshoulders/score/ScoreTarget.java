package com.bigshoulders.score;

public class ScoreTarget extends Score {
	
	public ScoreTarget(){
		targetScore = new BaseTarget1Score();
	}
	
	public void display(){
		System.out.println("I'm a ScoreTarget, baseTarget1Score");
	}

}
