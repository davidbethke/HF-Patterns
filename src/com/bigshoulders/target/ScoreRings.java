package com.bigshoulders.target;

public class ScoreRings extends TargetDecorator {
  
	public ScoreRings(Target myTarget){
		this.myTarget = myTarget;
	}
	@Override
	public String getDescription() {
		// super
		myTarget.getDescription();
		System.out.println("Im Scoring Rings");
		return "Scoring Rings";
	}

	

}
