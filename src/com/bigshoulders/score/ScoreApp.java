package com.bigshoulders.score;

import java.util.ArrayList;
import java.util.Comparator;

import com.bigshoulders.target.Target;
import java.util.Collections;

public class ScoreApp extends Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetScore =0;
		int userScoreVal =0;
		int userScoreValTwo = 0;
		int userScoreValThree = 0;
		int groupScoreVal = 0;
		Score baseTarget1 = new ScoreTarget();
		Score baseTarget1_2= new ScoreTarget();
		Score baseTarget2 = new ScoreTargetTwo();
		Score baseTarget1_3 = new ScoreTarget();
		Score baseTarget1_4 = new ScoreTarget();
		//
		ArrayList<TargetScore> userTarget = new ArrayList<TargetScore>();
		userTarget.add(baseTarget1.getTarget());
		userTarget.add(baseTarget1_3.getTarget());
		userTarget.add(baseTarget1_4.getTarget());
		userTarget.add(baseTarget1_2.getTarget());
		userTarget.add(baseTarget2.getTarget());
		System.out.println("presort");
		for (TargetScore ts : userTarget){
			System.out.print(" "+ts.calcTargetScore()+",");
		}
		Comparator comparator = new TargetComparator();
		Collections.sort(userTarget,comparator);
		System.out.println("\npostsort");
		for (TargetScore ts : userTarget){
			System.out.print(" "+ts.calcTargetScore()+",");
		}
		
		Score userScore = new ScoreUser(userTarget);
		System.out.println("UserScore");
		//userScore.display();
		userScoreVal =userScore.getUserScore();
		System.out.println("End UserScore1:"+userScoreVal);
		//
		//Score Group
		System.out.println("group start");
		ArrayList<UserScore> groupTarget = new ArrayList<UserScore>();
		//int someScore = userScore.getUser().calcUserScore();
		//someScore = userScore.getUser().calcUserScore();
		//System.out.println("SomeScore:"+ someScore);
		groupTarget.add(userScore.getUser());
		
		//groupScore.display();
		//user 2
		ArrayList<TargetScore> userTargetTwo = new ArrayList<TargetScore>();
		userTargetTwo.add(baseTarget1.getTarget());
		Score userScoreTwo = new ScoreUser(userTargetTwo);
		userScoreValTwo = userScoreTwo.getUserScore();
		System.out.println("User2 score"+ userScoreValTwo);
		groupTarget.add(userScoreTwo.getUser());
		//user 3
		ArrayList<TargetScore> userTargetThree = new ArrayList<TargetScore>();
		userTargetThree.add(baseTarget2.getTarget());
		Score userScoreThree = new ScoreUser(userTargetThree);
		userScoreValThree = userScoreThree.getUserScore();
		System.out.println("User3 score"+userScoreValThree);
		groupTarget.add(userScoreThree.getUser());
		Score groupScore = new ScoreGroup(groupTarget);
		groupScoreVal = groupScore.getOverallUserScore();
		
		
		System.out.println("Group Score:"+ groupScoreVal);
		System.out.println("group end");
		//
		
		//baseTarget1.display();
		//baseTarget1_2.display();
		targetScore = baseTarget1.getTargetScore();
		targetScore+= baseTarget1_2.getTargetScore();
		System.out.println("Score is:"+ targetScore);

	}

}
