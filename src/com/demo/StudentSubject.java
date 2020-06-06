package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生主体 - 被观察的对象
 */
public class StudentSubject extends Subject {
	/**
	 * 上课状态
	 */
	private String state;

	private List<Observer> observableList = new ArrayList<>();

	/**
	 * 修改通知
	 */
	@Override
	public void doNotify() {
		for (Observer observer : observableList) {
			observer.update(state);
		}
	}

	/**
	 * 添加被观察者
	 */
	@Override
	public void addObservable(Observer observable) {
		observableList.add(observable);
	}

	/**
	 * 移除被观察者
	 */
	@Override
	public void removeObservable(Observer observable) {
		try {
			if (observable == null) {
				throw new Exception("要移除的被观察者不能为空");
			} else {
				if (observableList.contains(observable)) {
					System.out.println("下课了," + observable.getIdentity() + " 已回到办公室");
					observableList.remove(observable);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}