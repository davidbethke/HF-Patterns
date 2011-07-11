package com.bigshoulders.patternOfPatterns;

public class Quackologist implements Observer {

	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + duck + " just quacked.");

	}

}
