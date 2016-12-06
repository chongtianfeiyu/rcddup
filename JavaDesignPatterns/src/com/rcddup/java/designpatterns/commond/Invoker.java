package com.rcddup.java.designpatterns.commond;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午2:59:32
*/
public class Invoker {
	private Commond commond;

	public Invoker(Commond commond) {
		this.commond = commond;
	}
	
	public void action(){
		commond.execute();
	}
	
}
