package com.design.patterns.singleton;

/**
 * synchronized关键字线程安全性能差
 * @author chuyuqiao
 *
 */
public class SynchronizedSingleton {

	private static SynchronizedSingleton uniqueInstance;

	private SynchronizedSingleton() {

	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SynchronizedSingleton();
		}
		return uniqueInstance;

	}
}
