package com.rcddup.java.designpatterns.memento;

/**
 * 备忘录模式（Memento）
 * <p>
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，通俗的讲下：假设有原始类A，A中有各种属性，
 * A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:08:13
 */
public class TestDemo {
	public static void main(String[] args) {
		// 创建原始类
		Original o = new Original("egg");
		// 创建备忘录
		Storage s = new Storage(o.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + o.getValue());
		o.setValue("new-egg");
		System.out.println("修改后的状态为：" + o.getValue());

		// 回复原始类的状态
		o.restoreMemento(s.getMemento());
		System.out.println("恢复后的状态为：" + o.getValue());
	}
}
