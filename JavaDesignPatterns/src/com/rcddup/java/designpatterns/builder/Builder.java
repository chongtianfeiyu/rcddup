package com.rcddup.java.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月2日下午2:20:53
*/
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
