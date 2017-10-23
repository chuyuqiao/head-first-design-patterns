package com.design.patterns.strategy;

/**
 * 飞的具体实现
 * @author chuyuqiao
 *
 */
public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly!!");

	}

}
