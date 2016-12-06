package com.rcddup.java.designpatterns.memento;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:08:32
 */
public class Original {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		super();
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

}
