package com.bigshoulders.composite;
import java.util.Iterator;
public class Waitress {
	Component allMenus;
	public Waitress(Component allMenus){
		this.allMenus = allMenus;
	}
	public void printMenu(){
		allMenus.print();
	}
	public void printVegetarianMenu(){
		Iterator iterator = allMenus.createIterator();
		System.out.println("Vegetarian Menu ---");
		while(iterator.hasNext()){
			Component menuComponent = (Component) iterator.next();
			try {
				if(menuComponent.isVegetarian()){
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e){}
		}
	}
}
