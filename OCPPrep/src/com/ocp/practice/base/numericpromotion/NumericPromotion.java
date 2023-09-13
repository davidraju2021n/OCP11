package com.ocp.practice.base.numericpromotion;

import com.ocp.practice.base.Base;

public class NumericPromotion extends Base {

	public static void main(String args[]) {
		NumericPromotion numericPromotion = new NumericPromotion();
		numericPromotion.rules();
	}
	public void rules() {
		p("******************Rules***************");
		p("1)If two values have different data types, Java will automatically promote\n" + 
				"one of the values to the larger of the two data types.");
		p("2)If one of the values is integral and the other is floating-point, Java will\n" + 
				"automatically promote the integral value to the floating-point value’s data\n" + 
				"type.");
		p("3)Smaller data types, namely, byte, short, and char, are first promoted to\n" + 
				"int any time they’re used with a Java binary arithmetic operator, even if\n" + 
				"neither of the operands is int.");
		p("4)After all promotion has occurred and the operands have the same data\n" + 
				"type, the resulting value will have the same data type as its promoted\n" + 
				"operands.");
	}
}
