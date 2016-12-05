package com.rcddup.java.designpatterns.iterator;

/**
 * 迭代子模式（Iterator）:
 * <p>
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。这句话包含两层意思：
 * 一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午1:06:45
 */
public class TestDemo {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator iterator = new MyIterator(collection);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(iterator.first());
	}
}
