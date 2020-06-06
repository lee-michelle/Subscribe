package com.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.demo2.Driver;
import com.demo2.Observer;
import com.demo2.PassengerXiaoHong;

/**
 * 被观察者
 * 
 * @author Administrator
 *
 */
public class BusDriver extends Observable implements Driver {

	private List<Observer> observers = new ArrayList<>();
	int i = 0;

	private PassengerXiaoHong xiaoHong = new PassengerXiaoHong();

	@Override
	public void drive() {
		System.out.println("司机说===车辆启动了。。。");
		i++;
		xiaoHong.update("start", i);
	}

	@Override
	public void stop() {
		System.out.println("司机说===到" + i + "站了，下一站" + (i + 1));
		xiaoHong.update("stop", i);
	}

}
