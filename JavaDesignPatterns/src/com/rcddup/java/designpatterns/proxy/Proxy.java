package com.rcddup.java.designpatterns.proxy;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午7:04:51
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("Before proxy.");
	}

	private void after() {
		System.out.println("After proxy.");
	}

}
