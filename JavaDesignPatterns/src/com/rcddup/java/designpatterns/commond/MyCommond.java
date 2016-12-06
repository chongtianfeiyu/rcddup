package com.rcddup.java.designpatterns.commond;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午2:56:23
 */
public class MyCommond implements Commond {

	private Receive receive;

	public MyCommond(Receive receive) {
		this.receive = receive;
	}

	@Override
	public void execute() {
		receive.action();
	}

}
