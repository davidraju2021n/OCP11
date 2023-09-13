package com.ocp.practice.base.wrappers;

import com.ocp.practice.base.Base;

public class ByteWrapper extends Base {

	public static void main(String args[]) {
		ByteWrapper byteWrapper = new ByteWrapper();
		byteWrapper.staticFields();
		byteWrapper.staticMethods();
		byteWrapper.instanceMethods();
	}
	
	public void staticFields() {
		p("Byte.BYTES:"+Byte.BYTES);
		p("Byte.SIZE:"+Byte.SIZE);
		p("Byte.TYPE:"+Byte.TYPE);
		p("Byte.MAX_VALUE"+Byte.MAX_VALUE);
		p("Byte.MIN_VALUE"+Byte.MIN_VALUE);
	}
	
	public void depricatedThings() {
		Byte byteWrapper1 = new Byte(Byte.MIN_VALUE);
		Byte byteWrapper2 = new Byte("1234");
		
	}
	
	public void staticMethods() {
		p("*****************static Method*****************");
		p("1.public static int compare​(byte x, byte y)");
		staticMethod_compare();
		
		p("2.public static int compareUnsigned​(byte x, byte y)");
		staticMethod_compareUnsigned();
		
		p("3.public static Byte decode​(String nm) throws NumberFormatException");
		staticMethod_decode();
		
		p("4.public static byte parseByte​(String s) throws NumberFormatException");
		staticMethod_parseBtye1();
		
		p("5.public static byte parseByte​(String s, int radix) throws NumberFormatException");
		staticMethod_parseByte2();
		
		p("6.public static int toUnsignedInt​(byte x)");
		staticMethod_toUnsignedInt();
		
		p("7.public static long toUnsignedLong​(byte x)");
		staticMethod_toUnsignedLong();
		
		p("8.public static Byte valueOf​(byte b)");
		staticMethod_valueOf1();
		
		p("9.public static Byte valueOf​(String s) throws NumberFormatException");
		staticMethod_valueOf2();

		p("10.public static Byte valueOf​(String s, int radix) throws NumberFormatException");
		staticMethod_valueOf3();
		
	}
	
	public void instanceMethods() {
		p("******************instance methods*******************");
		p("1.public byte byteValue()");
		instanceMethod_byteValue();
		
		p("2.public int compareTo​(Byte anotherByte)");
		instanceMethod_compareTo();
		
		p("3.public double doubleValue()");
		instanceMehod_doubleValue();
		
		p("4.public float floatValue()");
		instanceMethod_floatValue();
		
		p("5.public int intValue()");
		instanceMethod_intValue();
		
		p("6.public long longValue()");
		instanceMethod_longValue();
		
		p("7.public short shortValue()");
		instanceMethod_shortValue();
	}
	
	private void instanceMethod_shortValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).shortValue()+"\n");

	}

	private void instanceMethod_longValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).longValue()+"\n");
		
	}

	private void instanceMethod_intValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).intValue()+"\n");

	}

	private void instanceMethod_floatValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).floatValue()+"\n");

	}

	private void instanceMehod_doubleValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).doubleValue()+"\n");
		
	}

	private void instanceMethod_compareTo() {
		p("Ex :- 127,127:"+Byte.valueOf(Byte.MAX_VALUE).compareTo(Byte.MAX_VALUE));
		p("Ex :- -128,127:"+Byte.valueOf(Byte.MIN_VALUE).compareTo(Byte.MAX_VALUE));
		p("Ex :- 127,-128:"+Byte.valueOf(Byte.MAX_VALUE).compareTo(Byte.MIN_VALUE)+"\n");
		
	}

	private void instanceMethod_byteValue() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.valueOf(Byte.MAX_VALUE).byteValue()+"\n");
	}


	
	private void staticMethod_valueOf1() {
		p("Ex :- '123':"+Byte.valueOf((byte)123)+"\n");
	}
	
	private void staticMethod_valueOf2() {
		p("Ex :- '123':"+Byte.valueOf("123")+"\n");		
	}
	
	private void staticMethod_valueOf3() {
		p("Ex :- '173',redix-8:"+Byte.valueOf("173", 8)+"\n");
	}

	private void staticMethod_toUnsignedInt() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.toUnsignedInt(Byte.MAX_VALUE)+"\n");
	}
	
	private void staticMethod_toUnsignedLong() {
		p("Ex :- "+Byte.MAX_VALUE+":"+Byte.toUnsignedLong(Byte.MAX_VALUE)+"\n");
	}

	private void staticMethod_parseByte2() {
		p("Ex :- 1245,radix-8:"+Byte.parseByte("173", 8));
		p("Ex :- 7B,radix-16:"+Byte.parseByte("7B", 16)+"\n");

	}

	private void staticMethod_parseBtye1() {
		p("Ex :- '12':"+Byte.parseByte("12"));
		p("Ex :- '-12':"+Byte.parseByte("-12"));
		p("Ex :- '0127':"+Byte.parseByte("0127")+"\n");
		
	}

	private void staticMethod_decode() {

		p("Ex :- '12':"+Byte.decode("12"));
		p("Ex :- '0x6b':"+Byte.decode("0x6b"));
		p("Ex :- '-#4c':"+Byte.decode("-#4c"));
		p("Ex :- '0x10':"+Byte.decode("0x10"));
		p("Ex :- '0127':"+Byte.decode("0127")+"\n");
		
	}

	private void staticMethod_compareUnsigned() {
		p("Ex :- 12,12:"+Byte.compareUnsigned((byte)12, (byte)12));
		p("Ex :- 12,13:"+Byte.compareUnsigned((byte)12, (byte)13));
		p("Ex :- 13,12:"+Byte.compareUnsigned((byte)13, (byte)12));		
		p("Ex :- -13,12:"+Byte.compareUnsigned((byte)-13, (byte)12));		
		p("Ex :- 13,-12:"+Byte.compareUnsigned((byte)13, (byte)-12));		
		p("Ex :- -12,-13:"+Byte.compareUnsigned((byte)-12, (byte)-13)+"\n");		
		
	}

	private void staticMethod_compare() {
		p("Ex :- 12,12:"+Byte.compare((byte)12, (byte)12));
		p("Ex :- 12,13:"+Byte.compare((byte)12, (byte)13));
		p("Ex :- -13,12:"+Byte.compare((byte)-32, (byte)12));
		p("Ex :- 13,12:"+Byte.compare((byte)13, (byte)11)+"\n");
	}


}
