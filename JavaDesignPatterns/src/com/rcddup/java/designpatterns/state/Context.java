package com.rcddup.java.designpatterns.state;
/**
*@author RuanCheng QQ:410093793
*@version 创建时间:2016年12月6日下午3:28:00
*/
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State state) {
		this.state = state;
	}
	
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}else if(state.getValue().equals("state2")){
			state.method2();
		}
	}
	
}
