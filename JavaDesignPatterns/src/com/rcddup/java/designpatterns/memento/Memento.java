package com.rcddup.java.designpatterns.memento;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:11:37
 */
public class Memento {
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
