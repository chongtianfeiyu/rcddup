package com.rcddup.java.designpatterns.adapter.classadapter;

/**
 * 适配器模式：
 * <p>
 * 类的适配器
 * </p>
 * <p>
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，
 * 将Source的功能扩展到Targetable里。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:15:37
 */
public class TestDemo {
	public static void main(String[] args) {
		// Targetable接口的实现类就具有了Source类的功能。
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
