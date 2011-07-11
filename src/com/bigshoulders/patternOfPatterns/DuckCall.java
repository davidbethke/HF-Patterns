package com.bigshoulders.patternOfPatterns;

public class DuckCall implements Quackable {
	Observable observable;
	public DuckCall(){
		this.observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Kwack!");
		notifyObservers();
	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
