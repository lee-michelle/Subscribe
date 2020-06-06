package com.demo;

/**
 * 主体类 - 模拟被观察者主体
 */
public abstract class Subject {
	/**
	 * 修改通知
	 */
	abstract void doNotify();

	/**
	 * 添加被观察者
	 */
	abstract void addObservable(Observer o);

	/**
	 * 移除被观察者
	 */
	abstract void removeObservable(Observer o);
}
