package com.rcddup.java.designpatterns.singleton;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日上午10:25:56
 */
public class Singleton {
	private static int temp = 0;	//用于测试该类是否只创建了一次
	
	public static int getTemp() {
		return temp;
	}
	
	public void printTemp(){
		System.out.println(Singleton.temp);
	}
	
	// 方法一：
	// 这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，
	// 肯定就会出现问题了，如何解决？

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 静态工程方法，创建实例 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
			Singleton.temp += 1;
		}
		return instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}

	// 方法二：解决多线程时候的不安全性

	// /* 私有构造方法，防止被实例化 */
	// private Singleton() {
	// }
	//
	// /* 此处使用一个内部类来维护单例 */
	// private static class SingletonFactory {
	// private static Singleton instance = new Singleton();
	// }
	//
	// /* 获取实例 */
	// public static Singleton getInstance() {
	// return SingletonFactory.instance;
	// }
	//
	// /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	// public Object readResolve() {
	// return getInstance();
	// }
}
