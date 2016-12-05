package com.rcddup.java.designpatterns.templatemethod;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月4日下午12:02:47
*/
public class Plus extends AbstractCalculator{

	@Override
	public int calculate(int num1, int num2) {
		return num1+num2;
	}

}
