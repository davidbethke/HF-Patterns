package com.bigshoulders.statemachine;

public class HasQuarterClass implements State {
	GumballMachine gumballMachine;
	public HasQuarterClass(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("quarter already inserted");

	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("crank turning, moving to sold state");
		gumballMachine.setState(gumballMachine.getSoldState());

	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

}
