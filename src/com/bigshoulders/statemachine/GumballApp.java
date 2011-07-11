package com.bigshoulders.statemachine;

public class GumballApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		for(int i=0; i<10; i++){
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			
		}

	}

}
