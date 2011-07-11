package com.bigshoulders.statemachine;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sold Out");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

}
