package com.rcddup.java.designpatterns.strategy;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月4日上午9:53:54
*/
public class Multiply extends AbstractCalculator implements ICalculator  {

	@Override
	public int calculate(String exp) {
		int[] iArr = split(exp,"\\*");
		return iArr[0]*iArr[1];
	}

}
