package com.design.patterns.factory;

/**
 * 工厂方法模式 Creator
 * abstract factory
 * {@link org.springframework.beans.factory.BeanFactory}
 * @author chuyuqiao
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(String type);
	
	
	
	
	
	
}
