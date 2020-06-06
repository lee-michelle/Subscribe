package com.demo2;

/**
 * 司机抽象类
 * 
 * @author Administrator
 *
 */

public interface Observable {
	public void notifyObserver(String content, int number);

	public void addObserver(Observer o);

	public void removeObserver(Observer o);
}
