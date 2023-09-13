package com.ocp.practice.base.wrappers;

import com.ocp.practice.base.Base;

public class ShortWrapper extends Base{
	public static void main(String args[]) {
		ShortWrapper shortWrapper = new ShortWrapper();
		shortWrapper.staticFields();
		shortWrapper.staticMethods();

	}
	public void staticFields() {
		p("Short.BYTES:"+Short.BYTES);
		p("Short.SIZE:"+Short.SIZE);
		p("Short.TYPE:"+Short.TYPE);
		p("Short.MAX_VALUE"+Short.MAX_VALUE);
		p("Short.MIN_VALUE"+Short.MIN_VALUE);
	}
	
	public void staticMethods() {
		p("1.public static short reverseBytes​(short i)");
		staticMethod_reverseBytes();
	}

	private void staticMethod_reverseBytes() {
		p("EX :- "+Short.MIN_VALUE+":"+Short.reverseBytes(Short.MIN_VALUE));
		p("EX :- "+Short.MAX_VALUE+":"+Short.reverseBytes(Short.MAX_VALUE));

	}
	
}
