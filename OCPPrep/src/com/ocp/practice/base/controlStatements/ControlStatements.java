package com.ocp.practice.base.controlStatements;

import com.ocp.practice.base.Base;

public class ControlStatements extends Base{
	
	public static void main(String args[]) {
		ControlStatements controlStatements = new ControlStatements();
		
		controlStatements.p("\n1.ifElse");
		controlStatements.ifElse();
		
		controlStatements.p("\n2.continue");
		controlStatements.continueStatement();
		
		controlStatements.p("\n3.break");
		controlStatements.breakStatement();
	
		controlStatements.p("\n4.goTo");
		controlStatements.goToStatement();
	}

	public void ifElse(){
		Integer a=Integer.valueOf(0);
		if(a==0)
			p("a==0 executed");
		else if(a instanceof Integer)
			p("a instanceof Integer executed");
		else
			p("else executed");
	}
	public void continueStatement() {
		int count=0;
		p("Count:"+count);

		for(int i=0;i<10;i++) {
			if(i!=0 & i%2==0)
				continue;
			else 
				count++;
		}
		
		p("Count:"+count);
	}
	
	public void breakStatement() {
		int i=0;
		int count=0;
		while(i<10) {
			if(i!=0 & (i%2==0))
				break;
			else {
				i++;
				count++;
			}
		}
		p("Count:"+count);

	}

	public void goToStatement() {
		int i=0,j=0;
		outer:while(i<5) {
			inner:while(j<5) {
				p("i="+i+",j="+j);
				if(i==1 & j==2)
					break outer;
				else
					j++;
			}
			j=0;
			i++;
		}
		
	}
	
}
