package com.rcddup.java.designpatterns.visitor;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午3:41:40
*/
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject："+sub.getSubject());
	}

}
