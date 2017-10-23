package com.design.patterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂方法模式  Product
 * @author chuyuqiao
 *
 */
public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppings=new ArrayList<String>();
	
	void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping: ");
		for(String topping:toppings){
			System.out.println(" "+topping);
		}
	}
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Placing pizza in offical PizzaStore box");
		
	}
	public String getName(){
		return name;
	}
	
}
