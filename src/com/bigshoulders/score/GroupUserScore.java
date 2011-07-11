package com.bigshoulders.score;

import java.util.ArrayList;

public class GroupUserScore implements OverallUserScore {
	ArrayList<UserScore> users = new ArrayList<UserScore>();
	private int groupScore;
	
	
	public GroupUserScore(ArrayList<UserScore> users){
		this.users = users;
	}
	
	public int calcOverallUserScore() {
		// TODO Auto-generated method stub
		System.out.println("my user size in group is"+users.size());
		//groupScore=0;
	
		for(UserScore us : users){
			//System.out.println("Group user score:"+ groupScore);
			//System.out.println("UserScore"+us.calcUserScore());
			groupScore +=us.calcUserScore();
		}
		return groupScore;
	}
	public void display(){
		System.out.println("I'm a Group User Score");
	}
}
