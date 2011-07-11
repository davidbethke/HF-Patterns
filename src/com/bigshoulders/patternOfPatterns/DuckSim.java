package com.bigshoulders.patternOfPatterns;

import java.util.ArrayList;
import java.util.List;

public class DuckSim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSim simulator = new DuckSim();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulater(duckFactory);
	}
		public void simulater(AbstractDuckFactory duckFactory){
		Goose goose = new Goose();
		Quackable gooseDuck = new GooseAdapter(goose);
		List<Quackable> quackList = new ArrayList<Quackable>();
		quackList.add(duckFactory.createDuckCall());
		quackList.add(duckFactory.createMallardDuck());
		quackList.add(duckFactory.createRedheadDuck());
		quackList.add(duckFactory.createRubberDuck());
		quackList.add(gooseDuck);
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(duckFactory.createDuckCall());
		flockOfDucks.add(duckFactory.createMallardDuck());
		flockOfDucks.add(duckFactory.createRedheadDuck());
		flockOfDucks.add(duckFactory.createRubberDuck());
		flockOfDucks.add(duckFactory.createMallardDuck());
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());


	
		
		
		System.out.println("Duck Simulator");
		/*
		for(Quackable duck : quackList){
			simulate(duck);
		}
		*/
		System.out.println("Number of quacks:"+ QuackCounter.getQuacks());
		
		System.out.println("Sim Flock w/ Observer");
		Observer quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		simulate(flockOfMallards);
		System.out.println("Number of quacks:"+ QuackCounter.getQuacks());
		for (int i=0; i<5; i++){
			System.out.println("i:"+i);
		}
			

		/*
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		*/

	}
	public static void simulate(Quackable duck){
	duck.quack();
	}

}
