package com.rcddup.java.designpatterns.factory;

/**
 * 工厂模式:
 * <p>
 * 工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式
 * 中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我 们会选用第三种——静态工厂方法模式。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日上午10:33:47
 */
public class TestDemo {

	public static void main(String[] args) {
		// SendFactory sf = new SendFactory();
		// Sender sender = sf.produceSms();
		// sender.Send();

		// 调用静态方法
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}

}
