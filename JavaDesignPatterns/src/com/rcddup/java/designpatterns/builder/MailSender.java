package com.rcddup.java.designpatterns.builder;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午1:03:48
 */
public class MailSender implements Sender {
	public MailSender() {
		System.out.println("MailSender is created.");
	}

	@Override
	public void Send() {
		System.out.println("This is MailSender.");
	}

}
