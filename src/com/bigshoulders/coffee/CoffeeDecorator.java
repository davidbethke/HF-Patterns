package com.bigshoulders.coffee;

import java.math.BigDecimal;

public abstract class CoffeeDecorator extends Component {
	 Component component;
	
	
	public abstract String getDescription();
	

	public abstract BigDecimal getCost();

}
