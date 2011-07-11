package com.bigshoulders.score;

import java.util.ArrayList;

public class ScoreGroup extends Score {
	public ScoreGroup(ArrayList<UserScore> groupScore){
		this.overallUserScore = new GroupUserScore(groupScore);
	}

}
