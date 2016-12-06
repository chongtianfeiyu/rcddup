package com.rcddup.java.designpatterns.visitor;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午3:42:09
*/
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		
		return "Love";
	}

}
