package com.enhance.observer;

/**
 * 观察者接口
 * @author chuyuqiao
 *
 */
public interface Observer {
	void update(float temp,float humidity,float pressure);
}
