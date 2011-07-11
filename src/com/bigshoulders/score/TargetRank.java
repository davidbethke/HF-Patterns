package com.bigshoulders.score;

import java.util.ArrayList;

public class TargetRank<TargetScore extends Comparable<TargetScore>> implements Rank<TargetScore> {
	TargetScore targetScore;
	public ArrayList<TargetScore> getRank(ArrayList<TargetScore> rankList){
		
		return rankList;
	}
	public int compareTo(Object object){
		targetScore = (TargetScore) object;
		
		return 1;
	}
}
