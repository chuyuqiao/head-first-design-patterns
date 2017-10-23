package com.design.patterns.decorator;

/**
 * 混合咖啡
 * 装饰模式 ConcreteComponent
 * @author chuyuqiao
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend(){
		description="HouseBlend";
	}
	@Override
	public double cost() {
		return 0.89;
	}

}
