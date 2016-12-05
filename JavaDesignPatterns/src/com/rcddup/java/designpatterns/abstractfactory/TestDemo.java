package com.rcddup.java.designpatterns.abstractfactory;

/**
 * 抽象工厂模式:
 * <p>
 * 这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，
 * 实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月2日下午1:23:44
 */
public class TestDemo {

	public static void main(String[] args) {
		Provider bf = new MailSenderFactory();
		Sender sender = bf.provice();
		sender.Send();
	}

}
