package com.jdk;

public class Main {
	public static void main(String[] args) {
		BusDriver bus = new BusDriver();
		for (int i = 1; i <= 10; i++) {
			bus.drive();
			bus.stop();
		}
	}
}
