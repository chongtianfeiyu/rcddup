package com.rcddup.java.designpatterns.memento;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午3:14:51
*/
public class Storage {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Storage(Memento memento) {
		this.memento = memento;
	}
	
	
}
