package com.bigshoulders.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<Component> {
	public Component next() {
		return null;
	}
	public boolean hasNext(){
		return false;
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
