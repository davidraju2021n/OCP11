package com.ocp.practice.base.operators;

import com.ocp.practice.base.Base;

public class UnaryOperators extends Base {

	public void postUnaryOpers() {
		int a =1;
		a++;
		p("expression++:"+a);
		a--;
		p("expression--:"+a);
	}
	
	public void preUnaryOpers() {
		int a=1;
		p("++expression:"+(++a));
		p("--expression:"+(--a));
	}
	
	public void otherUnaryOpers() {
		int a=1;
		a=a+2;
		p("+:"+a);
		a=a-2;
		p("-:"+a);
		p("remining : ~,!,(type)");
		
	}
}
