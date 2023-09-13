package com.ocp.practice.base.wrappers;

public class IntegerWrapper {

	public static void main(String args[]) {
		IntegerWrapper integerWrapper = new IntegerWrapper();
		integerWrapper.staticMethods();
	}
	
	public void staticMethods() {
		p("********************static methods**********************");
		p("\n1.public static int bitCount​(int i)");
		staticMethod_bitCount();
		
		p("\n2.public static int divideUnsigned​(int dividend, int divisor)");
		staticMethod_divideUnsigned();
		
		p("\n3.public static Integer getInteger​(String nm)");
		staticMethod_getInteger1();
		
		p("\n4.public static Integer getInteger​(String nm, int val)");
		staticMethod_getInteger2();
		
		p("\n5.public static Integer getInteger​(String nm, Integer val)");
		staticMethod_getInteger3();
		
		p("\n6.public static int highestOneBit​(int i)");
		staticMethod_highestOneBit();
		
		p("\n7.public static int lowestOneBit​(int i)");
		staticMethod_lowestOneBit();

		p("\n8.public static int max​(int a, int b)");
		staticMethod_max();
		
		p("\n9.public static int min​(int a, int b)");
		staticMethod_min();
		
		p("\n10.public static int numberOfLeadingZeros​(int i)");
		staticMethod_numberOfLeadingZeros();
		
		p("\n11.public static int numberOfTrailingZeros​(int i)");
		staticMethod_numberOfTrailingZeros();
		
		p("\n12.public static int parseInt​(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException");
		staticMethod_parseInt1();
		
		p("\n13.public static int parseInt​(String s) throws NumberFormatException");
		staticMethod_parseInt2();
		
		p("\n14.public static int parseInt​(String s, int radix) throws NumberFormatException");
		staticMethod_parseInt3();
		
		p("\n15.public static int parseUnsignedInt​(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException");
		staticMethod_parseUnsignedInt1();
		
		p("\n16.lic static int parseUnsignedInt​(String s) throws NumberFormatException");
		staticMethod_parseUnsignedInt2();
		
		p("\n17.public static int parseUnsignedInt​(String s, int radix) throws NumberFormatException");
		staticMethod_parseUnsignedInt3();
		
		p("\n18.public static int remainderUnsigned​(int dividend, int divisor)");
		staticMethod_remainderUnsigned();
		
		p("\n19.public static int reverse​(int i)");
		staticMethod_reverse();

		p("\n20.public static int rotateLeft​(int i, int distance)");
		staticMethod_rotateLeft();
		
		p("\n21.public static int rotateRight​(int i, int distance)");
		staticMethod_rotateRight();
		
		p("\n22.public static int signum​(int i)");
		staticMethod_signum();
		
		p("\n23.public static int sum​(int a, int b)");
		staticMethod_sum();
		
		p("\n24.public static String toBinaryString​(int i)");
		staticMethod_toBinaryString();
		
		p("\n25.public static String toHexString​(int i)");
		staticMethod_toHexString();
		
		p("\n26.public static String toOctalString​(int i)");
		staticMethod_toOctalString();
		
		p("\n27.public static String toString​(int i)");
		staticMethod_toString1();
		
		p("\n28.public static String toString​(int i,int radix)");
		staticMethod_toString2();

		p("\n29.public static long toUnsignedLong​(int x)");
		staticMethod_toUnsignedLong();
		
		p("\n30.public static String toUnsignedString​(int x)");
		staticMethod_toUnsignedString1();
		
		p("\n31.public static String toUnsignedString(int x,int radix)");
		staticMethod_toUnsignedString2();
		
		p("\n32.public static Integer valueOf​(int i)");
		staticMethod_valueOf1();

		p("\n33.public static Integer valueOf​(String s) throws NumberFormatException");
		staticMethod_valueOf2();

		p("\n34.public static Integer valueOf​(String s, int radix) throws NumberFormatException");
		staticMethod_valueOf3();

	}

	
	private void staticMethod_valueOf3() {
		p("\tEx = 173,8:"+Integer.valueOf(Integer.toString(173), 8));
	}

	private void staticMethod_valueOf2() {
		p("\tEx = 123:"+Integer.valueOf(Integer.toString(123)));		
	}

	private void staticMethod_valueOf1() {
		p("\tEx = 123:"+Integer.valueOf(123));		
	}

	private void staticMethod_toUnsignedString2() {
		p("\tEx = "+Integer.MAX_VALUE+":"+Integer.toUnsignedString(Integer.MAX_VALUE));
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toUnsignedString(Integer.MIN_VALUE));
		
	}

	private void staticMethod_toUnsignedString1() {
		p("\tEx = "+Integer.MAX_VALUE+":"+Integer.toUnsignedString(Integer.MAX_VALUE));
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toUnsignedString(Integer.MIN_VALUE));
		
	}

	private void staticMethod_toUnsignedLong() {
		p("\tEx = 123:"+Integer.toUnsignedLong(123));
	}

	private void staticMethod_toString2() {
		p("\tEx = 173,8:"+Integer.toString(173, 8));
		
	}

	private void staticMethod_toString1() {
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toString(Integer.MIN_VALUE));
		
	}

	private void staticMethod_toOctalString() {
		p("\tEx = "+Integer.MAX_VALUE+":"+Integer.toOctalString(Integer.MAX_VALUE));		
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toOctalString(Integer.MIN_VALUE));
	}

	private void staticMethod_toHexString() {
		p("\tEx = "+Integer.MAX_VALUE+":"+Integer.toHexString(Integer.MAX_VALUE));		
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toHexString(Integer.MIN_VALUE));
	}

	private void staticMethod_toBinaryString() {
		p("\tEx = "+Integer.MAX_VALUE+":"+Integer.toBinaryString(Integer.MAX_VALUE));
		p("\tEx = "+Integer.MIN_VALUE+":"+Integer.toBinaryString(Integer.MIN_VALUE));

	}

	private void staticMethod_sum() {
		p("\tEx = 12,13"+Integer.sum(12, 13));
	}

	private void staticMethod_signum() {
		p("\tEx = 123:"+Integer.signum(123));
		p("\tEx = (-123):"+Integer.signum(-123));
	}

	private void staticMethod_rotateRight() {
		p("\tEx = 123,2"+Integer.rotateRight(123, 2));
		
	}

	private void staticMethod_rotateLeft() {
		p("\tEx = 123,2"+Integer.rotateLeft(123, 2));
	}

	private void staticMethod_reverse() {
		p("\tEx = 123456:"+Integer.reverse(123456));
	}

	private void staticMethod_remainderUnsigned() {

		p("\tEx = 55/5:"+Integer.remainderUnsigned(55, 5));
		p("\tEx = 5/55:"+Integer.remainderUnsigned(5, 55));
		p("\tEx = (-55)/5:"+Integer.remainderUnsigned(-55, 5));
		p("\tEx = 55/(-5):"+Integer.remainderUnsigned(55, -5));
	}

	private void staticMethod_parseUnsignedInt3() {
		p("\tEx = 173,8:"+Integer.parseUnsignedInt("173", 8));
		
	}

	private void staticMethod_parseUnsignedInt2() {
		p("\tEx = 123:"+Integer.parseUnsignedInt("123"));
		
	}

	private void staticMethod_parseUnsignedInt1() {
		p("\tEx = 1734,0,3,8:"+Integer.parseUnsignedInt("1734", 0, 3, 8));
		
	}

	private void staticMethod_parseInt3() {
		p("\tEx = 173,8:"+Integer.parseInt("173", 8));
		p("\tEx = 173,8:"+Integer.parseInt("-173", 8));
		
	}

	private void staticMethod_parseInt2() {
		p("\tEx = 123:"+Integer.parseInt("123"));
		p("\tEx = 123:"+Integer.parseInt("-123"));

	}

	private void staticMethod_parseInt1() {
		p("\tEx = 1734,0,3,8:"+Integer.parseInt("1734", 0, 3, 8));
		p("\tEx = 1734,0,3,8:"+Integer.parseInt("-1734", 0, 3, 8));

	}

	private void staticMethod_numberOfTrailingZeros() {
		p("\tEx = 12:"+Integer.numberOfTrailingZeros(12));
		p("\tEx = 10:"+Integer.numberOfTrailingZeros(10));

	}

	private void staticMethod_numberOfLeadingZeros() {
		p("\tEx = 12:"+Integer.numberOfLeadingZeros(12));
		p("\tEx = 10:"+Integer.numberOfLeadingZeros(10));

	}

	private void staticMethod_min() {
		p("\tEx = 10,11:"+Integer.min(10, 11));
		p("\tEx = 11,10:"+Integer.min(11, 10));
		p("\tEx = (-10),11:"+Integer.min(-10, 11));
		p("\tEx = 10,(-11):"+Integer.min(10, -11));		
	}

	private void staticMethod_max() {
		p("\tEx = 10,11:"+Integer.max(10, 11));
		p("\tEx = 11,10:"+Integer.max(11, 10));
		p("\tEx = (-10),11:"+Integer.max(-10, 11));
		p("\tEx = 10,(-11):"+Integer.max(10, -11));

	}

	private void staticMethod_lowestOneBit() {
		p("\tEx = 10:"+Integer.lowestOneBit(10));
		p("\tEx = 20:"+Integer.lowestOneBit(20));
	}

	private void staticMethod_highestOneBit() {

		p("\tEx = 10:"+Integer.highestOneBit(10));
		p("\tEx = 20:"+Integer.highestOneBit(20));

	}

	private void staticMethod_getInteger3() {
		System.setProperty("temp1", "456");
		System.setProperty("temp3", "temp3");

		p("\tEx = temp1:"+Integer.getInteger("temp1",Integer.valueOf("101")));
		p("\tEx = temp2:"+Integer.getInteger("temp2",Integer.valueOf("101")));
		p("\tEx = temp3:"+Integer.getInteger("temp3",Integer.valueOf("101")));

	}
	
	private void staticMethod_getInteger2() {
		System.setProperty("temp1", "456");
		System.setProperty("temp3", "temp3");

		p("\tEx = temp1:"+Integer.getInteger("temp1",101));
		p("\tEx = temp2:"+Integer.getInteger("temp2",101));
		p("\tEx = temp3:"+Integer.getInteger("temp3",101));

	}

	
	private void staticMethod_getInteger1() {
		System.setProperty("temp1", "456");
		System.setProperty("temp3", "temp3");

		p("\tEx = temp1:"+Integer.getInteger("temp1"));
		p("\tEx = temp2:"+Integer.getInteger("temp2"));
		p("\tEx = temp3:"+Integer.getInteger("temp3"));

	}

	private void staticMethod_divideUnsigned() {

		p("\tEx = 55%5:"+Integer.divideUnsigned(55, 5));
		p("\tEx = 49%5:"+Integer.divideUnsigned(49, 5));
		p("\tEx = (-49)%5:"+Integer.divideUnsigned(-49, 5));
		p("\tEx = 49%(-5):"+Integer.divideUnsigned(49, -5));

	}

	private void staticMethod_bitCount() {
		p("\tEx = 123:"+Integer.bitCount(123));
	}
	
	private void p(String str) {
		System.out.println(str);
	}
}
