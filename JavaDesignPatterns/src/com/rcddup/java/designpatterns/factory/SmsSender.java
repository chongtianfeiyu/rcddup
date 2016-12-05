package com.rcddup.java.designpatterns.factory;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午1:05:03
*/
public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("This is SmsSender.");
	}
	
}
