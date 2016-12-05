package com.rcddup.java.designpatterns.abstractfactory;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午1:33:17
*/
public class SmsSenderFactory implements Provider{

	@Override
	public Sender provice() {
		return new SmsSender();
	}

}
