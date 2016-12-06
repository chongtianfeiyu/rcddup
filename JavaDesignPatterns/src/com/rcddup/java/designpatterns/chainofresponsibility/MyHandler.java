package com.rcddup.java.designpatterns.chainofresponsibility;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午1:22:34
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + " deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
