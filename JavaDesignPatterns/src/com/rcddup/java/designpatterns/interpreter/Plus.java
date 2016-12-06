package com.rcddup.java.designpatterns.interpreter;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午4:00:00
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
