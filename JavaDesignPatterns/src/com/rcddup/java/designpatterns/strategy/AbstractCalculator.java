package com.rcddup.java.designpatterns.strategy;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日上午9:50:33
 */
public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		String[] sArr = exp.split(opt);
		int[] iArr = new int[2];
		iArr[0] = Integer.parseInt(sArr[0]);
		iArr[1] = Integer.parseInt(sArr[1]);
		return iArr;
	}
}
