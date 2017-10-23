package com.enhance.decorator;

/**
 * 饮料
 * 装饰模式的Component
 * 
 * @author chuyuqiao
 *
 */
public abstract class Beverage {

	String description ="Unknown Beverage";
	
	/**
	 * 获取描述
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * 价格抽象方法
	 * @return
	 */
	public abstract double cost();
}
