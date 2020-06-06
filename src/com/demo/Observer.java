package com.demo;

/**
 * 构建一个发现者的抽象类以及相关的实现类，老师和班主任都分别继承了该接口并重写相关方法,
 * 
 * @author Administrator
 *
 */
public abstract class Observer {
	abstract void update(Object args);

	public Observer(String identity) {
		this.identity = identity;
	}

	private String identity;

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

}
