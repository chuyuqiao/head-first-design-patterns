package com.enhance.decorator;

/**
 * 浓缩咖啡
 * 装饰模式 ConcreteComponent
 * @author chuyuqiao
 *
 */
public class Espresso extends Beverage {

	public Espresso(){
		description="Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
