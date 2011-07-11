package com.bigshoulders.score;

import java.util.Comparator;

public class TargetComparator implements Comparator<TargetScore> {
 public int compare(TargetScore target1, TargetScore target2){
	 if (target1.calcTargetScore() < target2.calcTargetScore()){
		 return -1;
	 }else if(target1.calcTargetScore() == target2.calcTargetScore()){
		 return 0;
	 }else // t1.t2
		 return 1;
 }
}
