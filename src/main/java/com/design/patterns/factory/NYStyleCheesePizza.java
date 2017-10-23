package com.enhance.factory;

/**
 * 工厂方法模式 ConcreteProduct
 * @author chuyuqiao
 *
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza(){
		name="NY Style Sauce and Cheese Pizza";
		dough="Thin Crust Dough";
		sauce="Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
