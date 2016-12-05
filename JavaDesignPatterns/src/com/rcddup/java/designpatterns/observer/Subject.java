package com.rcddup.java.designpatterns.observer;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午12:17:56
 */
public interface Subject {
	/* 增加观察者 */
	public void add(Observer observer);

	/* 删除观察者 */
	public void delete(Observer observer);

	/* 通知所有的观察者 */
	public void notifyObservers();

	/* 自身的操作 */
	public void operation();
}
