package com.ocp.practice.base.wrappers;

import com.ocp.practice.base.Base;

public class FloatWrapper extends Base{
	public static void main(String... argsp) {
		FloatWrapper floatWrapper = new FloatWrapper();
		floatWrapper.staticFields();
		floatWrapper.staticMethods();
	}
	
	public void staticFields() {
		p("***********static fields****************");
		p("MAX_EXPONENT :" +Float.MAX_EXPONENT);
		p("MIN_EXPONENT :" +Float.MIN_EXPONENT);
		p("MAX_VALUE :" +Float.MAX_VALUE);
		p("MIN_VALUE :" +Float.MIN_VALUE);
		p("MIN_NORMAL :" +Float.MIN_NORMAL);
		p("NaN :" +Float.NaN);
		p("NEGATIVE_INFINITY :" +Float.NEGATIVE_INFINITY);
		p("POSITIVE_INFINITY :" +Float.POSITIVE_INFINITY);
	}
	public void staticMethods() {
		p("****************static methods************");
		p("\n1.public static int compare​(float f1, float f2)");
		staticMethod_compare();
		
		p("\n2.public static int floatToIntBits​(float value)");
		staticMethod_floatToIntBits();
		
		p("\n3.public static int floatToRawIntBits​(float value)");
		staticMethod_floatToRawIntBits();
		
		p("\n4.public static float intBitsToFloat​(int bits)");
		staticMethod_intBitsToFloat();
		
		p("\n5.public static boolean isFinite​(float f)");
		staticMethod_isFinite();
		
		p("\n6.public static boolean isInFinite​(float f)");
		staticMethod_isInFinite();

		p("\n7.public static boolean isNaN​(float v)");
		staticMethod_isNaN();

		p("\n8.sum​(float a, float b)");
		staticMethod_sum();

	}

	private void staticMethod_sum() {
		p("\tEx = :"+Float.sum(Float.valueOf("50.1"), Float.valueOf("50.2")));
	}

	private void staticMethod_isNaN() {
		p("\tEx = "+Float.MAX_VALUE+":"+Float.isNaN(Float.MAX_VALUE));
		p("\tEx = "+Float.MIN_VALUE+":"+Float.isNaN(Float.MIN_VALUE));
		p("\tEx = "+Float.MIN_NORMAL+":"+Float.isNaN(Float.MIN_NORMAL));
	}

	private void staticMethod_isInFinite() {
		p("\tEx = "+Float.MAX_VALUE+":"+Float.isInfinite(Float.MAX_VALUE));
		p("\tEx = "+Float.MIN_VALUE+":"+Float.isInfinite(Float.MIN_VALUE));
		p("\tEx = "+Float.MIN_NORMAL+":"+Float.isInfinite(Float.MIN_NORMAL));

	}

	private void staticMethod_isFinite() {
		p("\tEx = "+Float.MAX_VALUE+":"+Float.isFinite(Float.MAX_VALUE));
		p("\tEx = "+Float.MIN_VALUE+":"+Float.isFinite(Float.MIN_VALUE));
		p("\tEx = "+Float.MIN_NORMAL+":"+Float.isFinite(Float.MIN_NORMAL));
	}

	private void staticMethod_intBitsToFloat() {
		p("\tEx = 123:"+Float.intBitsToFloat(123));
	}

	private void staticMethod_floatToRawIntBits() {
		p("\tEx = "+Float.MIN_NORMAL+":"+Float.floatToRawIntBits(Float.MIN_NORMAL));
	}

	private void staticMethod_floatToIntBits() {
		p("\tEx = "+Float.MIN_NORMAL+":"+Float.floatToIntBits(Float.MIN_NORMAL));
	}

	private void staticMethod_compare() {
		p("\tEx =  "+Float.MAX_VALUE+","+Float.MIN_VALUE+":"+Float.compare(Float.MAX_VALUE, Float.MIN_VALUE));
		p("\tEx =  "+Float.MIN_VALUE+","+Float.MAX_VALUE+":"+Float.compare(Float.MIN_VALUE, Float.MAX_VALUE));
		p("\tEx =  "+Float.MIN_NORMAL+","+Float.MIN_NORMAL+":"+Float.compare(Float.MIN_NORMAL, Float.MIN_NORMAL));

	}
}
