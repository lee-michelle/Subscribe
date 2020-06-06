package com.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 老师类 - 观察者之一 - 观察学生的上课情况
 */
public class TeacherObserver extends Observer {

	private Course course;

	@Override
	public void update(Object args) {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
		System.out.println("我是老师,正在讲课中...");
		course = new Course(new Date(), "A栋教学楼", "Java课程");
		System.out.println(
				"今天上课时间:" + df.format(course.getTime()) + " 地点:" + course.getPlace() + " 上课内容:" + course.getContent());
	}

	public TeacherObserver(String identity) {
		super(identity);
	}
}
