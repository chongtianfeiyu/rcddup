package com.rcddup.java.designpatterns.decorator;

/**
 * 装饰器模式:
 * <p>
 * 装饰器模式的应用场景
 * </p>
 * <p>
 * 1、需要扩展一个类的功能。
 * </p>
 * <p>
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * </p>
 * <p>
 * 缺点：产生过多相似的对象，不易排错！
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午6:53:33
 */
public class TestDemo {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
