package com.design.patterns.factory;

/**
 * 工厂方法模式 ConcreteCreator
 * concrete factory
 * @author chuyuqiao
 *
 */
public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else{
			return null;
		}
	}

}
