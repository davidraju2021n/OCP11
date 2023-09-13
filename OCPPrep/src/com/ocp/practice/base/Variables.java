package com.ocp.practice.base;

public class Variables extends Base {

	int instanceVariable =1;
	public void rules() {
		p("**************************Rules**************");
		p("\n1.Variable = datatype + identifier = literal/otherVariable");
	}
	
	
	public void examples() {
		int a = 1;
		p("Ex = 1)int a = 1;#Here 'int' is primitive dataType,'a' is identifier,'1' is literal");
		int b=a;
		p("Ex = 2)int b = a;#Here 'int' is primitive dataType,'b' is identifier,'a' is another Variable");
		int c=1,d=1;
		p("Ex = 3)int c=1,d=1;#Here 'int' is primitive dataType,'c,d' are identifier,'1' is literal");
	}
	
	public void scope() {
		int localVariable=1;
		p("\n1)local variable scope will be within the method");

		instanceVariable=2;
		p("2)instance variable  scope will througout the class instance");

		GlobalVariableScope.globalVariable=2;
		p("3)global variable scope will be public");
	}
}
class GlobalVariableScope{
	public static int globalVariable=1;
}
