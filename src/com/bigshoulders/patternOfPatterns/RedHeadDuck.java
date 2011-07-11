package com.bigshoulders.patternOfPatterns;

public class RedHeadDuck implements Quackable {
	Observable observable;
	public RedHeadDuck(){
		this.observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack!");
		notifyObservers();
	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
