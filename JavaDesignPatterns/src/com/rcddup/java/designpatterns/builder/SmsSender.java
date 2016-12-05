package com.rcddup.java.designpatterns.builder;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午1:05:03
*/
public class SmsSender implements Sender{
	
	public SmsSender() {
		System.out.println("SmsSender is created.");
	}

	@Override
	public void Send() {
		System.out.println("This is SmsSender.");
	}
	
}
