package com.ocp.practice.base.switchCase;

import com.ocp.practice.base.Base;

public class SwitchCase extends Base{
	
	public static void main(String args[]) {
		SwitchCase switchCase = new SwitchCase();
//		switchCase.switchCase(12);
//		switchCase.switchCase(11);
//		switchCase.switchCase(10);

	}

	public void switchCase(int a) {
		
		p("input is a:"+a);
		switch(a) {
		case 12 : p("case 12 executed");
					break;
		case 11 : p("case 11 executed");
					break;
		default : p("default case executed");
					break;
		}
	}
	

}

