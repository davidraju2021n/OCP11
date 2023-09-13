package com.ocp.practice.base.loops;


import com.ocp.practice.base.Base;

public class ForLoop extends Base {

	public void forLoop() {
		int a=0;
		for(int i=0;i<10;i++) {
			a++;
		}
	}
	
	public void ForEach() {
		int[] numbers= {1,2,3,4,5};
		for(int number:numbers)
			p("number:"+number);
	}
}
