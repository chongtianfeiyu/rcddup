package com.rcddup.java.designpatterns.abstractfactory;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午1:33:03
*/
public class MailSenderFactory implements Provider {

	@Override
	public Sender provice() {
		return new MailSender();
	}

}
