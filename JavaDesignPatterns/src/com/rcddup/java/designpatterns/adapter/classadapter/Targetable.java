package com.rcddup.java.designpatterns.adapter.classadapter;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:19:49
 */
public interface Targetable {
	/* 与原类(Source)中的方法相同 */
	public void method1();

	/* 新类的方法 */
	public void method2();
}
