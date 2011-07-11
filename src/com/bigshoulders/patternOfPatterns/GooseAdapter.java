package com.bigshoulders.patternOfPatterns;

public class GooseAdapter implements Quackable {
	Observable observable;
	Goose goose;
	public GooseAdapter(Goose goose){
		this.goose = goose;
		this.observable = new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();

	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
