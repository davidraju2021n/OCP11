package com.ocp.practice.base.operators;

import java.util.HashMap;

import com.ocp.practice.base.Base;

public class Operators extends Base{
	
	public static void main(String args[]) {
		Operators operators = new Operators();
		operators.p("\n1.PostUnaryOpers(exp++,exp--)");
		operators.postUnaryOpers();

		operators.p("\n2.PreUnaryOpers(++exp,--exp)");
		operators.preUnaryOpers();
		
		operators.p("\n3.OtherUnaryOpers(-,+,~,!,(type))");
		operators.otherUnaryOpers();
		
		operators.p("\n4.additiveAndMulitplications(+,-,/,%,*)");
		operators.additiveAndMulitplications();
		
		operators.p("\n5.relationalOpers(<,>,<=,>=,instanceof)");
		operators.relationalOpers();
		
		operators.p("\n6.EqualityOpers(==,!=)");
		operators.equalityOpers();
		
		operators.p("\n7.LogicalOpers(&,|,^)");
		operators.logicalOpers();
		
		operators.p("\n8.ShortCircuitOpers(&&,||)");
		operators.shortCircuitOpers();
		
		operators.p("\n9.TernaryOpers");
		operators.ternaryOpers();
		
		operators.p("\n10.AssignmentOpers(=,+=,-=,*=,/=,%=,&=,^=,|=,<<=,>>=,>>>=)");
		operators.assignementOpers();
		
		operators.p("\n11.ShiftOpers(<<,>>,>>>)");
		operators.shiftOpers();
	}

	public void postUnaryOpers() {
		int a =1;
		p("int a=1");
		a++;
		p("a++");
		p("expression++:"+a);
		a--;
		p("a--");
		p("expression--:"+a);
	}
	
	public void preUnaryOpers() {
		int a=1;
		p("int a=1");
		p("++expression:"+(++a));
		p("--expression:"+(--a));
	}
	
	public void otherUnaryOpers() {
		int a=1;
		p("int a=1");
		a=a+2;
		p("a+2");
		p("+:"+a);
		a=a-2;
		p("a-2");
		p("-:"+a);
		p("remining : ~,!,(type)");
		
	}
	
	public void additiveAndMulitplications() {
		p("multiplication (1*2) : "+(1*2));
		p("Division : (1/2)"+(1/2));
		p("Modulus : (1%2)"+(1%2));
		p("addition : (1+2)"+(1+2));
		p("substraction: (1-2)"+(1-2));

	}
	
	public void shiftOpers() {
		
	}
	
	public void relationalOpers() {
		p("(1<2):"+(1<2));
		p("(1>2):"+(1>2));
		p("(1<=2):"+(1<=2));
		p("(1>=2):"+(1>=2));
		NullPointerException e = new NullPointerException("not found");
		Exception pe =new Exception("parent");
		p("Boolean.toString(e instanceof Exception):"+Boolean.toString(e instanceof Exception));
	}
	
	public void equalityOpers() {
		p("1==2:"+(1==2));
		p("1!=2:"+(1!=2));

	}
	
	public void logicalOpers() {
		p("(true&(false&true)):"+(true&(false&true)));
//		p("^:"+(^(true)));
		p("(true|false):"+(true|false));
	}
	
	public void shortCircuitOpers() {
		p("(true&&true):"+(true&&true));
		p("(true||true):"+(true||true));

	}
	
	public void ternaryOpers() {
		p("exp?true:false = "+(1>0?1:0));
	}
	public void assignementOpers() {
		int a =1;
		p("int a=1");
		p("=:"+a);
		a+=1;
		p("+=:"+a);
		a-=1;
		p("-=:"+a);
		a*=2;
		p("*=:"+a);
		a/=1;
		p("/=:"+a);
		a%=2;
		p("%=:"+a);
		
//		1.&=
//		2.^=
//		3.|=
//		4.<<=
//		5.>>=
//		6.>>>=
				

	}
	
}
