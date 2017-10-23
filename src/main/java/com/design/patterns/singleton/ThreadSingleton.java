package com.design.patterns.singleton;

/**
 * 线程安全单件
 * @author chuyuqiao
 *
 */
public class ThreadSingleton {

	private static ThreadSingleton uniqueInstance = new ThreadSingleton();

	private ThreadSingleton() {

	}

	public static ThreadSingleton getInstance() {
		return uniqueInstance;
	}
}
