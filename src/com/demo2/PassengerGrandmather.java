package com.demo2;

public class PassengerGrandmather implements Observer {

	@Override
	public boolean update(String content, int number) {
		if ("start".equals(content) && number < 6) {
			System.out.println("Grandmather坐着");
		}
		if ("stop".equals(content) && number == 6) {
			System.out.println("Grandmather下车");
			return true;
		}
		return false;
	}

}
