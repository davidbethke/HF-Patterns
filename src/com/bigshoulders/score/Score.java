package com.bigshoulders.score;

import java.util.ArrayList;

public abstract class Score {
	TargetScore targetScore;
	UserScore userScore;
	OverallUserScore overallUserScore;
	Rank rank;
	
	public  int getTargetScore(){
		return targetScore.calcTargetScore();
		
	}
	public  int getUserScore(){
		return userScore.calcUserScore();
		
	}
	public  int getOverallUserScore(){
		return overallUserScore.calcOverallUserScore();
	
	}
	public <T> ArrayList<T> getRank(ArrayList<T> rankList){
		return rankList;
	}
	public TargetScore getTarget(){
		return targetScore;
	}
	public UserScore getUser(){
		return userScore;
	}
	public void display(){}
	
}
