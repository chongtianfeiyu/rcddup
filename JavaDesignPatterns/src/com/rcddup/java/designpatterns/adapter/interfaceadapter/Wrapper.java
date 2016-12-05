package com.rcddup.java.designpatterns.adapter.interfaceadapter;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:26:56
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is the Targetable method!");
	}

}
