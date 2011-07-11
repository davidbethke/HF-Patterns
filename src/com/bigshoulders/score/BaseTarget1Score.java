package com.bigshoulders.score;

public class BaseTarget1Score implements TargetScore{
	private static int baseTarget1ScoreCount=0;
	private int targetInstance;
	public BaseTarget1Score(){
		targetInstance = baseTarget1ScoreCount++;
	}
	public int calcTargetScore() {
		// TODO Auto-generated method stub
		//System.out.println("I'm a BaseTarget1Score instance number:" + targetInstance);
		//System.out.println("Total BaseTarget1Score targets is: " + baseTarget1ScoreCount);
		return 100+targetInstance;
	}
	/*
	public int compareTo(Object object){
		TargetScore score = (TargetScore) object;
		if(this.calcTargetScore() < score.calcTargetScore()){
			return -1;
		}else if(this.calcTargetScore() == score.calcTargetScore()){
			return 0;
		}else //(this.calcTargetScore() > score.calcTargetScore())
			return 1;
	}
	*/

}
