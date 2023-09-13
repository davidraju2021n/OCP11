package com.ocp.practice.base.wrappers;

import com.ocp.practice.base.Base;

public class BooleanWrapper extends Base{

	public static void main(String args[]) {
		BooleanWrapper booleanWrapper = new BooleanWrapper();
		booleanWrapper.staticMethods();
		booleanWrapper.instanceMethods();
	}
	public void depricatedthings() {
		Boolean depricatedBooleanIntialization1 = new Boolean(true);
		Boolean depricatedBooleanIntialization2 = new Boolean("true");
	}
	
	public void staticMethods() {
		
		p("1.public static int compare​(boolean x, boolean y)");
		staticMethod_compare();
		
		p("2.public static boolean getBoolean​(String name)");
		staticMethod_getBoolean();
		
		p("3.public static int hashCode​(boolean value)");
		staticMethod_hashCode();
		
		p("4.public static boolean logicalAnd​(boolean a, boolean b)");
		staticMethod_logicalAnd();

		p("5.public static boolean logicalOr​(boolean a, boolean b)");
		staticMethod_logicalOr();
		
		p("6.public static boolean logicalXor​(boolean a, boolean b)");
		staticMethod_logicalXor();
		
		p("7.public static boolean parseBoolean​(String s)");
		staticMethod_parseBoolean();
		
		p("8.public static String toString​(boolean b)");
		staticMethod_toString();
		
		p("9.public static Boolean valueOf​()");
		staticMethod_valueOf();
		
		
	}
	
	public void instanceMethods() {
		
		p("1.public boolean booleanValue()");
		instanceMethod_booleanValue();
		
		p("2.public int compareTo​(Boolean b)");
		instanceMethod_compareTo();

		p("3.public boolean equals​(Object obj)");
		instanceMethod_equals();
	}
	
	private void instanceMethod_equals() {
		
		p("Ex :- true.equals(true):"+Boolean.valueOf(true).equals(true));
		p("Ex :- true.equals(false):"+Boolean.valueOf(true).equals(false));
		p("Ex :- false.equals(true):"+Boolean.valueOf(false).equals(true));
		p("Ex :- false.equals(false):"+Boolean.valueOf(false).equals(false)+"\n");

	}
	private void instanceMethod_compareTo() {
		p("Ex :- true.compareTo(true):"+Boolean.valueOf(true).compareTo(true));
		p("Ex :- true.compareTo(false):"+Boolean.valueOf(true).compareTo(false));
		p("Ex :- false.compareTo(true):"+Boolean.valueOf(false).compareTo(true));
		p("Ex :- false.compareTo(false):"+Boolean.valueOf(false).compareTo(false)+"\n");

	}
	private void instanceMethod_booleanValue() {
		p("Ex :- true:"+Boolean.valueOf(true).booleanValue());
		p("Ex :- false:"+Boolean.valueOf(false).booleanValue());
		p("Ex :- 'true':"+Boolean.valueOf("true").booleanValue());
		p("Ex :- 'asdf':"+Boolean.valueOf("asdf").booleanValue()+"\n");

	}
	private void staticMethod_valueOf() {
		p("9.1.public static Boolean valueOf​(boolean a)");
		Boolean valueOfOutput1 = Boolean.valueOf(true);
		p("Ex :- true:"+valueOfOutput1);
		Boolean valueOfOutput2 = Boolean.valueOf(false);
		p("Ex :- true:"+valueOfOutput2+"\n");
		
		p("9.2.public static Boolean valueOf​(String bs)");
		Boolean valueOfOutput3 = Boolean.valueOf("true");
		p("Ex :- 'true':"+valueOfOutput3);
		Boolean valueOfOutput4 = Boolean.valueOf("false");
		p("Ex :- 'false':"+valueOfOutput4);
		Boolean valueOfOutput5 = Boolean.valueOf("asdf");
		p("Ex :- 'asdf':"+valueOfOutput5+"\n");
		
		
	}
	private void staticMethod_toString() {
		String toStringOutput1 = Boolean.toString(true);
		p("Ex :- true:"+toStringOutput1);
		String toStringOutput2 = Boolean.toString(false);
		p("Ex :- false:"+toStringOutput2);
		String toStringOutput3 = Boolean.toString(Boolean.valueOf("yep"));
		p("Ex :- yep:"+toStringOutput3+"\n");
		
	}
	private void staticMethod_parseBoolean() {
		boolean parseBooleanOutput1 = Boolean.parseBoolean("true");
		p("Ex :- true:"+parseBooleanOutput1);
		boolean parseBooleanOutput2 = Boolean.parseBoolean("false");
		p("Ex :- false:"+parseBooleanOutput2);
		boolean parseBooleanOutput3 = Boolean.parseBoolean("");
		p("Ex :- empty:"+parseBooleanOutput3);
		boolean parseBooleanOutput4 = Boolean.parseBoolean(null);
		p("Ex :- null:"+parseBooleanOutput4+"\n");
		
	}
	private void staticMethod_logicalXor() {
		boolean logicalXorOutput1 = Boolean.logicalXor(true, true);
		p("Ex :- true,true : "+logicalXorOutput1);
		boolean logicalXorOutput2 = Boolean.logicalXor(true, false);
		p("Ex :- true,false : "+logicalXorOutput2);
		boolean logicalXorOutput3 = Boolean.logicalXor(false, false);
		p("Ex :- false,false : "+logicalXorOutput3);
		boolean logicalXorOutput4 = Boolean.logicalXor(false, true);
		p("Ex :- false,true : "+logicalXorOutput4+"\n");		
	}
	private void staticMethod_logicalOr() {
		boolean logicalOrOutput1 = Boolean.logicalOr(true, true);
		p("Ex :- true,true : "+logicalOrOutput1);
		boolean logicalOrOutput2 = Boolean.logicalOr(true, false);
		p("Ex :- true,false : "+logicalOrOutput2);
		boolean logicalOrOutput3 = Boolean.logicalOr(false, false);
		p("Ex :- false,false : "+logicalOrOutput3);
		boolean logicalOrOutput4 = Boolean.logicalOr(false, true);
		p("Ex :- false,true : "+logicalOrOutput4+"\n");		
	}
	private void staticMethod_logicalAnd() {
		boolean logicalAndOutput1 = Boolean.logicalAnd(true, true);
		p("Ex :- true,true : "+logicalAndOutput1);
		boolean logicalAndOutput2 = Boolean.logicalAnd(true, false);
		p("Ex :- true,false : "+logicalAndOutput2);
		boolean logicalAndOutput3 = Boolean.logicalAnd(false, false);
		p("Ex :- false,false : "+logicalAndOutput3);
		boolean logicalAndOutput4 = Boolean.logicalAnd(false, true);
		p("Ex :- false,true : "+logicalAndOutput4+"\n");

	}
	private void staticMethod_hashCode() {
		int hashCodeOutput1=Boolean.hashCode(true);
		int hashCodeOutput2=Boolean.hashCode(false);
		p("Ex :- true :"+hashCodeOutput1);
		p("Ex :- false :"+hashCodeOutput2+"\n");
	}
	private void staticMethod_compare() {
		int compareOutput1 = Boolean.compare(true, true);
		p("Ex :- true,true : "+compareOutput1);
		int compareOutput2 = Boolean.compare(true, false);
		p("Ex :- true,false : "+compareOutput2);
		int compareOutput3 = Boolean.compare(false, false);
		p("Ex :- false,false : "+compareOutput3);
		int compareOutput4 = Boolean.compare(false, true);
		p("Ex :- false,true : "+compareOutput4+"\n");

	}
	private void staticMethod_getBoolean() {
		System.setProperty("temp1", "temp1Val");
		System.setProperty("temp2", "true");
		System.setProperty("temp3", "false");
		p("Added system properties : temp1-temp1Val,temp2-true,temp3");
		boolean getBooleanOutput1 = Boolean.getBoolean("temp1");
		p("Ex :- temp1:"+getBooleanOutput1);
		boolean getBooleanOutput2 = Boolean.getBoolean("temp2");
		p("Ex :- temp2:"+getBooleanOutput2);
		boolean getBooleanOutput3 = Boolean.getBoolean("temp3");
		p("Ex :- temp3:"+getBooleanOutput3+"\n");
	}
}
