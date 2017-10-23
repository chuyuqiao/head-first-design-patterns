package com.design.patterns.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testDecorator(){
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		Beverage beverage2=new HouseBlend();
		beverage2=new Mocha(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		
	}
}
