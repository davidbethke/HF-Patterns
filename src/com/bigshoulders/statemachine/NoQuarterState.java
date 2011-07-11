package com.bigshoulders.statemachine;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter accepted ..");
		gumballMachine.setState(gumballMachine.getHasQuarterState());

	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("pay quarter first");

	}

	public void dispense() {
		// TODO Auto-generated method stub
		

	}

}
