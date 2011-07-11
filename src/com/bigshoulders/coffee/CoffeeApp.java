package com.bigshoulders.coffee;

public class CoffeeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component coffee = new Milk(new SimpleCoffee());
		//coffee.getDescription();
		//coffee.getCost();
		
		System.out.println("Type:"+coffee.getDescription());
		System.out.println ("Cost:"+coffee.getCost().toString());

	}

}
