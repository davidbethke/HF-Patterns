package com.bigshoulders.patternOfPatterns;

public class RubberDuck implements Quackable {
	Observable observable;
	public RubberDuck(){
		this.observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Squeak!");
		notifyObservers();
	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
