package com.rcddup.java.designpatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午12:48:01
 */
public abstract class AbstractSubject implements Subject {
	
	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enums = vector.elements();
		while(enums.hasMoreElements()){
			enums.nextElement().update();
		}
	}

}
