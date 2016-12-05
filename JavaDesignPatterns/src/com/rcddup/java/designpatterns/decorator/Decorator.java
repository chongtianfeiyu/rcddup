package com.rcddup.java.designpatterns.decorator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:55:31
 */
public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("Before decorator!");
		source.method();
		System.out.println("After decorator!");
	}

}
