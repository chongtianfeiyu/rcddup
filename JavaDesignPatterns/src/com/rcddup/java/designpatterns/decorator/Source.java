package com.rcddup.java.designpatterns.decorator;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午6:54:19
*/
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("This is original method.");
	}

}
