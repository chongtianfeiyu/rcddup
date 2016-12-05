package com.rcddup.java.designpatterns.compsite;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午9:08:45
 */
public class Tree {
	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}
}
