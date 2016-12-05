package com.rcddup.java.designpatterns.adapter.interfaceadapter;

/**
 * 适配器模式：
 * <p>
 * 对象的适配器
 * </p>
 * <p>
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:15:37
 */
public class TestDemo {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable t = new Wrapper(source);
		t.method1();
		t.method2();
	}
}
