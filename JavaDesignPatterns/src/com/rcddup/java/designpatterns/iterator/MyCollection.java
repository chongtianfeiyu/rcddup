package com.rcddup.java.designpatterns.iterator;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月4日下午1:24:48
*/
public class MyCollection implements Collection{
	public String[] strs = {"A","B","C","D","E","F"};

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return strs[i];
	}

	@Override
	public int size() {
		return strs.length;
	}
	
}
