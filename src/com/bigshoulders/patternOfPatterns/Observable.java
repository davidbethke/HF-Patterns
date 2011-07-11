package com.bigshoulders.patternOfPatterns;

import java.util.ArrayList;

public class Observable implements QuackObservable {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck){
		this.duck = duck;
	}

	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);

	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers){
			o.update(duck);
		}

	}

}
