package com.ocp.practice.base;

public class Literals extends Base{

	public static void main(String args[]) {
		Literals literals = new Literals();
		literals.DisplayRules();
		literals.integerLiterals();
		literals.floatLiterals();
		literals.charLiterals();
		literals.stringLiterals();
		literals.booleanLiterals();
	}

	private void booleanLiterals() {
		p("\n*************boolean Literals*****************");
        boolean b = true;
        System.out.println(b);

        boolean c = false;
        System.out.println(c);
        
//		ErrorCase : error: incompatible types: int cannot be converted to boolean
//        boolean d = 0;
//        boolean b = 1;		
	}

	private void stringLiterals() {
		p("\n*************string Literals*****************");
		System.out.println("Any sequence of characters within double quotes is treated as String literals.");

		String s = "Hello";

//		errroCase
//		String s1 = Hello;

		System.out.println(s);
	}

	private void charLiterals() {
		p("\n*************char Literals*****************");

		System.out.println("Single quote: We can specify literal to a char data type as a single character within the single quote.");
        char ch = 'a';
        System.out.println(ch);


        System.out.println("Char literal as Integral literal: can be specified either in Decimal, Octal, and Hexadecimal forms. But the allowed range is 0 to 65535.");
        char b = 062;
        System.out.println(b);

        System.out.println("Unicode Representation: can specify char literals in Unicode representation ‘\\uxxxx’");
      char c = '\u0061';
      System.out.println(c);

      System.out.println("Escape Sequence: Every escape character can be specified as char literals.");
      char escape='\n';
      System.out.println(escape);
     		
	}

	private void floatLiterals() {
		p("\n*************float Literals*****************");

		System.out.println("Float literals : we can specify literals in only decimal form, and we cant specify in octal and Hexadecimal forms");
        float a = 101.230f;
        System.out.println(a);

      float b = 0123.222f;
      System.out.println(b);

        // Hexa-decimal form (error)
//      float c = 0x123.222;
     
	}

	private void integerLiterals() {
		p("\n*************integer Literals*****************");

		System.out.println("Decimal literals (Base 10): In this form, the allowed digits are 0-9.");
		        int a = 101;
		        System.out.println(a);

		        System.out.println("Octal literals (Base 8): In this form, the allowed digits are 0-7");
		        int b = 0100;
		        System.out.println(b);

		        System.out.println("Hexa-decimal literals (Base 16): In this form, the allowed digits are 0-9, and characters are a-f.");
		        int c = 0xFace;
		        System.out.println(c);

		        System.out.println("Binary literals: we can specify literal value even in binary form also, allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B.");
		        int d = 0b1111;		       
		        System.out.println(d);
		
	}

	private void DisplayRules() {
		
		
	}
}
