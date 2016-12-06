package com.rcddup.java.designpatterns.state;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:26:36
 */
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the method-1");
	}

	public void method2() {
		System.out.println("execute the method-2");
	}
}
