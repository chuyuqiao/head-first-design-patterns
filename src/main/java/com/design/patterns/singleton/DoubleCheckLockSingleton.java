package com.enhance.singleton;

/**
 * 双重检查加锁单件
 * @author chuyuqiao
 *
 */
public class DoubleCheckLockSingleton {

	//当uniqueInstance被初始化成Singleton实例时，多个线程正确地处理uniqueInstance变量。
	private volatile static DoubleCheckLockSingleton uniqueInstance;

	private DoubleCheckLockSingleton() {

	}

	public static DoubleCheckLockSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized(DoubleCheckLockSingleton.class){
				if (uniqueInstance == null){
					uniqueInstance=new DoubleCheckLockSingleton();
				}
			}
		}
		return uniqueInstance;

	}
	
}
