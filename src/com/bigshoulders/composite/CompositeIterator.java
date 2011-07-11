package com.bigshoulders.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Component> {
	Stack stack = new Stack<Iterator>();
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
		
	}
	public Component next(){
		if(hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			Component component =(Component) iterator.next();
			if (component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		}else{
			return null;
		}
	}
	public boolean hasNext(){
		if (stack.empty()){
			return false;
		}else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
				
			}else {
				return true;
			}
				
		}
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}

}
