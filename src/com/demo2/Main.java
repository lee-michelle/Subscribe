package com.demo2;

public class Main {
	public static void main(String[] args) {
		BusDriver bus = new BusDriver();
		PassengerGrandmather grandmather = new PassengerGrandmather();
		PassengerXiaoHong xiaoHong = new PassengerXiaoHong();
		PassengerXiaoZhang PxiaoZhang = new PassengerXiaoZhang();
		bus.addObserver(PxiaoZhang);
		bus.addObserver(xiaoHong);
		bus.addObserver(grandmather);
		for (int i = 1; i <= 10; i++) {
			bus.drive();
			bus.stop();
		}
	}
}
