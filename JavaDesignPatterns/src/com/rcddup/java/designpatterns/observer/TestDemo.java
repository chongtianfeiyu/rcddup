package com.rcddup.java.designpatterns.observer;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午12:14:14
 */
public class TestDemo {
	public static void main(String[] args) {
		Subject	 sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}
}
