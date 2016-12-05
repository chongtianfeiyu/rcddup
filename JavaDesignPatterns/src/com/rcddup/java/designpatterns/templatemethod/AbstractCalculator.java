package com.rcddup.java.designpatterns.templatemethod;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日上午11:55:44
 */
public abstract class AbstractCalculator {
	/* 主方法，实现对本类其它方法的调用 */
	public final int calculate(String exp, String opt) {
		int[] iArr = split(exp, opt);
		return calculate(iArr[0], iArr[1]);
	}

	/* 被子类重写的方法 */
	public abstract int calculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		String[] sArr = exp.split(opt);
		int[] iArr = new int[2];
		iArr[0] = Integer.parseInt(sArr[0]);
		iArr[1] = Integer.parseInt(sArr[1]);
		return iArr;
	}
}
