package com.rcddup.java.designpatterns.iterator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午1:13:53
 */
public interface Iterator {
	/* 前移 */
	public Object previous();

	/* 后移 */
	public Object next();

	public boolean hasNext();

	/* 去得第一个元素 */
	public Object first();
}
