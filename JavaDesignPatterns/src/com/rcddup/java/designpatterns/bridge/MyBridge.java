package com.rcddup.java.designpatterns.bridge;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月3日下午7:20:50
*/
public class MyBridge extends Bridge{

	@Override
	public void method() {
		getSource().method();
	}
	
}
