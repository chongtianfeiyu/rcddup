package com.rcddup.java.designpatterns.proxy;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午7:03:53
*/
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("This is original method.");
	}

}
