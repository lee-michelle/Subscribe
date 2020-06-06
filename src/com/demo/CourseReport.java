package com.demo;

/**
 * 课程报告 - 一起回顾这节有意思的课
 */
public class CourseReport {
	public static void main(String[] args) {
		// 创建学生主体
		StudentSubject studentSubject = new StudentSubject();
		// 创建观察者老师
		TeacherObserver teacherObversable = new TeacherObserver("老师");
		// 创建观察者班主任
		HeadTeacherObserver headTeacherObserver = new HeadTeacherObserver("班主任");
		// 学生反映上课状态
		studentSubject.setState("(*^▽^*)讲的不错,很好,随手点个关注和在看!");
		studentSubject.addObservable(teacherObversable);
		studentSubject.addObservable(headTeacherObserver);
		// 开始上课
		studentSubject.doNotify();
		// 上课结束
		studentSubject.removeObservable(headTeacherObserver);
		studentSubject.removeObservable(teacherObversable);
	}
}
