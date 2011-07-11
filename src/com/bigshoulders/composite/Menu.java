package com.bigshoulders.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends Component {
	private ArrayList<Component> menuComponents;
	private String name;
	private String description;
	
	public Menu(String name, String description){
		this.menuComponents  = new ArrayList<Component>();
		this.name = name;
		this.description = description;
	}
	public void add(Component menuComponent){
		menuComponents.add(menuComponent);
	}
	public void remove(Component menuComponent){
		menuComponents.remove(menuComponent);
	}
	public Component getChild(int i){
		return (Component)menuComponents.get(i);
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public Iterator createIterator(){
		return new CompositeIterator(menuComponents.iterator());
	}
	public void print(){
		System.out.print("\n"+ getName());
		System.out.println(", " + getDescription());
		System.out.println("----------------");
		for (Component item : menuComponents){
			item.print();
		}
	}
}
