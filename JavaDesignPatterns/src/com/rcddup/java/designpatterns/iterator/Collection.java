package com.rcddup.java.designpatterns.iterator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午1:11:19
 */
public interface Collection {
	public Iterator iterator();

	/* 取得集合元素 */
	public Object get(int i);

	/* 取得集合大小 */
	public int size();
}
