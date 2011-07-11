package com.bigshoulders.adapter;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();

	}

	public void fly() {
		// TODO Auto-generated method stub
		for (int i=0; i < 5; i++){
			turkey.fly();
		}

	}

}
