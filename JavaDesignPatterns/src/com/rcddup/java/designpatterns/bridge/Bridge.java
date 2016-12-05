package com.rcddup.java.designpatterns.bridge;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午7:19:16
 */
public class Bridge {
	private Sourceable source;

	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

}
