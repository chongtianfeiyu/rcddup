package com.rcddup.java.designpatterns.factory;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午1:05:52
 */
public class SendFactory {
	// 方法一：传递参数
	// public Sender produce(String type) {
	// if ("mail".equals(type)) {
	// return new MailSender();
	// } else if ("sms".equals(type)) {
	// return new SmsSender();
	// } else {
	// System.out.println("类型错误！");
	// return null;
	// }
	// }

	// 方法二：创建方法
	// public Sender produceMail() {
	// return new MailSender();
	// }
	//
	// public Sender produceSms() {
	// return new SmsSender();
	// }

	// 方法三：创建静态方法--静态工厂模式（工厂模式一般选择此方法）
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
