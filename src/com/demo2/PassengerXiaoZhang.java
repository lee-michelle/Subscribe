package com.demo2;

public class PassengerXiaoZhang implements Observer {

	@Override
	public boolean update(String content, int number) {
		if ("start".equals(content) && number < 8) {
			System.out.println("XiaoZhang站着");
		}
		if ("stop".equals(content) && number == 8) {
			System.out.println("XiaoZhang下车");
			return true;
		}
		return false;
	}

}
