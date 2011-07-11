package com.bigshoulders.score;

public class BaseTarget2Score implements TargetScore {
	private static int baseTarget2Count=0;
	public BaseTarget2Score(){
		baseTarget2Count++;
	}
	public int calcTargetScore() {
		// TODO Auto-generated method stub
		//System.out.println("I'm a BaseTarget2 and my count is:"+ baseTarget2Count);
		return 50;
	}

}
