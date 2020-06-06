package com.demo2;

public class PassengerXiaoHong implements Observer {

	@Override
	public boolean update(String content, int number) {
		if ("start".equals(content) && number < 2) {
			System.out.println("XiaoHong半蹲");
		}
		if ("stop".equals(content) && number == 2) {
			System.out.println("XiaoHong下车");
			return true;
		}
		return false;
	}

}
