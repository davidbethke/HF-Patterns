package com.bigshoulders.patternOfPatterns;

public class QuackCounter implements Quackable {
	Observable observable;
	Quackable duck;
	private static int quackCounter=0;
	public QuackCounter(Quackable duck){
		this.duck = duck;
		this.observable = new Observable(this);
	}

	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		quackCounter++;
		notifyObservers();

	}
	public static int getQuacks(){
		return quackCounter;
	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
