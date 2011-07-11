package com.bigshoulders.adapter;

public class DuckTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		WIldTurkey turkey = new WIldTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The Duck says...");
		testDuck(duck);
		
		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
	}
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
