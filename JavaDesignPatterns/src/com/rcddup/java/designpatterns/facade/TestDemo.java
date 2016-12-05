package com.rcddup.java.designpatterns.facade;

/**
 * 外观模式（Facade）：
 * <p>
 * 外观模式是为了解决类与类之间的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，
 * 降低了类类之间的耦合度，该模式中没有涉及到接口。
 * </p>
 * <p>
 * 以一个计算机的启动过程为例
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午6:54:19
 */
public class TestDemo {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
