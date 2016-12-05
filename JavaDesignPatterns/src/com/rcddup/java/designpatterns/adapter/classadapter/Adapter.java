package com.rcddup.java.designpatterns.adapter.classadapter;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午6:21:25
*/
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("This is Targetable method!");
	}
	
}
