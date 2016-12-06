package com.rcddup.java.designpatterns.chainofresponsibility;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午1:18:49
 */
public abstract class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
