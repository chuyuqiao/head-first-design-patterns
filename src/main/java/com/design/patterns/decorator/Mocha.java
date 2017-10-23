package com.enhance.decorator;

/**
 * 摩卡咖啡
 * 装饰模式 ConcreteDecorator
 * @author chuyuqiao
 *
 */
public class Mocha extends Condiment {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}
	
	public double cost(){
		return 0.20+beverage.cost();
	}

}
