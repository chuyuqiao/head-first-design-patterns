package com.enhance.observer;

/**
 * 主题接口
 * @author chuyuqiao
 *
 */
public interface Subject {
	/**
	 * 注册
	 * @param observer
	 */
	void registerObserver(Observer observer);
	/**
	 * 删除
	 * @param observer
	 */
	void removeObserver(Observer observer);
	/**
	 * 响应
	 */
	void notifyObservers();
}
