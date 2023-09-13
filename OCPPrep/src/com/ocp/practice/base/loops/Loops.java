package com.ocp.practice.base.loops;

import com.ocp.practice.base.Base;

public class Loops extends Base {
	
	public static void main(String args[]) {
		Loops loops = new Loops();
		loops.forLoop();
		loops.forEach();
		loops.whileLoop();
		loops.doWhile();
	}
	
	public void forLoop() {
		int a=0;
		for(int i=0;i<10;i++) {
			a++;
		}
	}
	
	public void forEach() {
		int[] numbers= {1,2,3,4,5};
		for(int number:numbers)
			p("number:"+number);
	}
	
	public void whileLoop() {
		int a=0;
		while(a<10)
			a++;
		p("whileLoop Ended ,a:"+a);
	}
	
	public void doWhile() {
		int a=0;
		do {
			a++;
		}
		while(a==0);

		p("doWhileLoop Ended ,a:"+a);
		
	}
	
}
