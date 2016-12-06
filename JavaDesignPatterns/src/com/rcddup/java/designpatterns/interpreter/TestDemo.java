package com.rcddup.java.designpatterns.interpreter;

/**
 * 解释器模式（Interpreter）:
 * <p>
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:57:12
 */
public class TestDemo {
	public static void main(String[] args) {
		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
