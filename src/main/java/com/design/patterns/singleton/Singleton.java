package com.design.patterns.singleton;

/**
 * 单件模式
 * 
 * @author chuyuqiao
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;

	}
}
