package com.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 
 * @author Administrator
 *
 */
public class BusDriver implements Driver, Observable {

	private List<Observer> observers = new ArrayList<>();
	int i = 0;

	@Override
	public void drive() {
		System.out.println("司机说===车辆启动了。。。");
		i++;
		notifyObserver("start", i);

	}

	@Override
	public void stop() {
		System.out.println("司机说===到" + i + "站了，下一站" + (i + 1));
		notifyObserver("stop", i);
	}

	@Override
	public void notifyObserver(String content, int number) {
		for (Observer observer : observers) {
			observer.update(content, number);

		}
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

}
