package com.bigshoulders.statemachine;

public class SoldState implements State {
	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void dispense() {
		// TODO Auto-generated method stub
		if(gumballMachine.getCount() != 0){
			gumballMachine.releaseBall();
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
