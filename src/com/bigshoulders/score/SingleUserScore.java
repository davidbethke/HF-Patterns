package com.bigshoulders.score;

import java.util.ArrayList;

public class SingleUserScore implements UserScore {
	
	ArrayList<TargetScore> targets = new ArrayList<TargetScore>();
	private  int singleUserScore=0;
	
	public SingleUserScore(ArrayList<TargetScore> targets){
		this.targets = targets;
	}
	public int calcUserScore() {
		singleUserScore=0;
		// TODO Auto-generated method stub
		for(TargetScore ts : targets){
			
			singleUserScore+=ts.calcTargetScore();
			//System.out.println("SingleUserScore:"+singleUserScore);
			
		}
		return singleUserScore;
	}
	
	public void display(){
		System.out.println("I'm a Single User Score");
	}

}
