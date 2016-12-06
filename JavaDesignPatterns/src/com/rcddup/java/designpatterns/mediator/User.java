package com.rcddup.java.designpatterns.mediator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:54:09
 */
public abstract class User {
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public abstract void work();
}
