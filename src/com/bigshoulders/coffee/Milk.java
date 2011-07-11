package com.bigshoulders.coffee;

import java.math.BigDecimal;

public class Milk extends CoffeeDecorator {

	public Milk(Component component){
		this.component = component;
		
	}
	public String getDescription() {
		//System.out.println(component.getDescription() + ",Milk");
		return "Milk"+ ", "+component.getDescription();
	}

	@Override
	public BigDecimal getCost() {
		//System.out.println(component.getCost().add(new BigDecimal(".50")).toString());
		return component.getCost().add(new BigDecimal(".50"));
	}

}
