package com.rcddup.java.designpatterns.mediator;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午3:53:06
*/
public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");  
	}

}
