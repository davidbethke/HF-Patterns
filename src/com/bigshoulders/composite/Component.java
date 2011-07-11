package com.bigshoulders.composite;
import java.util.Iterator;
public abstract class Component {
	public void add (Component menuComponent){
		throw new UnsupportedOperationException();
	}
	public void remove(Component menuComponent){
		throw new UnsupportedOperationException();
	}
	public Component getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
	public Iterator createIterator (){
		throw new UnsupportedOperationException();
	}

}
