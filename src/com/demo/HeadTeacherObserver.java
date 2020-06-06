package com.demo;

/**
 * 班主任来听课 - 观察者之一 - 观察学生的上课情况
 */
public class HeadTeacherObserver extends Observer {
	@Override
	public void update(Object args) {
		System.out.println("我是班主任来听课了,正在检查课程质量...");
		System.out.println("学生反馈课程质量为:" + args);
	}

	public HeadTeacherObserver(String identity) {
		super(identity);
	}
}
