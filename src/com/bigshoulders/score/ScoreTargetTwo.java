package com.bigshoulders.score;

public class ScoreTargetTwo extends Score {
	public ScoreTargetTwo(){
		targetScore = new BaseTarget2Score();
	}
	
	public void display(){
		System.out.println("I'm a ScoreTargetTwo, baseTarget2Score");
	}
}
