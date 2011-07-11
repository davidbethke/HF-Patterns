package com.bigshoulders.patternOfPatterns;

public interface QuackObservable {

	public void registerObserver(Observer observer);
	public void notifyObservers();
}
