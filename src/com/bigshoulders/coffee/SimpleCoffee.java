package com.bigshoulders.coffee;

import java.math.BigDecimal;

public class SimpleCoffee extends Component {

	@Override
	public String getDescription() {
		//System.out.println("I am a Simple Coffee.");
		return "Simple Coffee";
	}

	@Override
	public BigDecimal getCost() {
		BigDecimal cost = new BigDecimal("1.00");
		//System.out.println ("I cost $:"+cost.toString());
		return cost;
	}

}
