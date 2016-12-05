package com.rcddup.java.designpatterns.compsite;

/**
 * 组合模式（Composite）:
 * <p>
 * 组合模式有时又叫部分-整体模式,在处理类似树形结构的问题时比较方便
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午8:49:28
 */
public class TestDemo {
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}
