package com.rcddup.java.designpatterns.iterator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午1:26:33
 */
public class MyIterator implements Iterator {
	private Collection collection;

	private int pos = -1;

	public MyIterator(Collection collection) {
		this.collection = collection;
	}

	@Override
	public Object previous() {
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if (pos < collection.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}

}
