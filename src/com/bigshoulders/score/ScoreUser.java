package com.bigshoulders.score;

import java.util.ArrayList;

public class ScoreUser extends Score {
	public ScoreUser(ArrayList<TargetScore> targets){
		this.userScore = new SingleUserScore(targets);
	}

}
