package com.bigshoulders.patternOfPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
       ArrayList<Quackable> quackers = new ArrayList<Quackable>();
       Observable observable;
       
       public Flock(){
    	   this.observable = new Observable(this);
       }
       
       public void add(Quackable quacker){
    	   quackers.add(quacker);
       }
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> itr = quackers.iterator();
		while(itr.hasNext()){
			itr.next().quack();
			notifyObservers();
		}
		

	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}

}
