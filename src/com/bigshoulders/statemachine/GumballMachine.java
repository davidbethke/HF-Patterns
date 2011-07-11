package com.bigshoulders.statemachine;

public class GumballMachine {
	State soldState;
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State state = soldOutState;
	int count =0;
	public GumballMachine(int count){
		this.soldState = new SoldState(this);
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterClass(this);
		this.count = count;
		if(count > 0){
			state= noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	public void setState(State state){
		this.state = state;
	}
	public int getCount(){
		return count;
	}
	public void releaseBall(){
		System.out.println("a gumball is rolling down the slot");
		if(count !=0){
			count--;
		}
	}
	public State getNoQuarterState(){
		return noQuarterState;
	}
	public State getHasQuarterState(){
		return hasQuarterState;
	}
	public State getSoldState(){
		return soldState;
	}
	public State getSoldOutState(){
		return soldOutState;
	}
	

}
