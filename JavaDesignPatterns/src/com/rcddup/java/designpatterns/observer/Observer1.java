package com.rcddup.java.designpatterns.observer;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月4日下午12:16:04
*/
public class Observer1 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer1 is received!");
	}

}
