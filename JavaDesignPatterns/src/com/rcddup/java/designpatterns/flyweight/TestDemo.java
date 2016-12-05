package com.rcddup.java.designpatterns.flyweight;

/**
 * 享元模式:
 * <p>
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 * </p>
 * <p>
 * FlyWeightFactory负责创建和管理享元单元，当一个客户端请求时，工厂需要检查当前对象池中是否有符合条件的对象，如果有，就返回已经存在的对象，
 * 如果没有，则创建一个新对象，FlyWeight是超类。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午9:15:43
 */
public class TestDemo {
	public static void main(String[] args) {

	}
}
