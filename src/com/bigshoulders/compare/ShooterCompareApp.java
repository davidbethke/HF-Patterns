package com.bigshoulders.compare;

import java.util.Arrays;

public class ShooterCompareApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shooter[] shooters ={
							new Shooter("Dave",5),
							new Shooter("Elsa",6),
							new Shooter("Kitty",2),
							new Shooter("otherKitty",10)
		};
		System.out.println("UnSorted");
		display(shooters);
		Arrays.sort(shooters);
		System.out.println("Sorted");
		display(shooters);

	}
	
	public static void display(Shooter[] shooters){
		for(Shooter s: shooters){
			System.out.println("Name:"+s.getName()+ " Score:"+ s.getScore());
		}
	}
	

}
