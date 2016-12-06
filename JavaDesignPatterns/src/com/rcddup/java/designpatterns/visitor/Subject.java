package com.rcddup.java.designpatterns.visitor;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:40:33
 */
public interface Subject {
	public void accept(Visitor visitor);

	public String getSubject();
}
