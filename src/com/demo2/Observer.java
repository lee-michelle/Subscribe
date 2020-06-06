package com.demo2;

/**
 * 构建一个发现者的抽象类以及相关的实现类，老师和班主任都分别继承了该接口并重写相关方法,
 * 
 * @author Administrator
 *
 */
public interface Observer {
	public boolean update(String content, int number);
}
