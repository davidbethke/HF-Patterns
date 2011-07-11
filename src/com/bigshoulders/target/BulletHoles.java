package com.bigshoulders.target;

public class BulletHoles extends TargetDecorator {
	
	public BulletHoles(Target myTarget){
		this.myTarget = myTarget;
	}
	@Override
	public String getDescription() {
		//super
		myTarget.getDescription();
		System.out.println("I'm BulletHoles");
		return "Bullet Holes";
	}

	

}
