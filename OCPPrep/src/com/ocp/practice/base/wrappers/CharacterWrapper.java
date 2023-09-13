package com.ocp.practice.base.wrappers;

import com.ocp.practice.base.Base;

public class CharacterWrapper extends Base{
	public static void main(String args[]) {
		CharacterWrapper characterWrapper = new CharacterWrapper();
		characterWrapper.staticMethods();
	}
	
	public void staticMethods() {
		p("***************static methods*****************");
		p("\n1.public static int charCount​(int codePoint)");
		staticMethod_charCount();
		
		p("\n2.public static int codePointAt​(char[] a, int index)");
		staticMethod_codePointAt1();
		
		p("\n3.public static int codePointAt​(char[] a, int index, int limit)");
		staticMethod_codePointAt2();

		p("\n4.public static int codePointAt​(CharSequence seq, int index)");
		staticMethod_codePointAt3();

		p("\n5.public static int codePointBefore​(char[] a, int index)");
		staticMethod_codePointBefore1();

		p("\n6.public static int codePointBefore​(char[] a, int index)");
		staticMethod_codePointBefore2();

		p("\n7.public static int codePointBefore​(CharSequence seq, int index)");
		staticMethod_codePointBefore3();

		p("\n8.public static int codePointCount​(char[] a, int offset, int count)");
		staticMethod_codePointCount1();

		p("\n9.public static int codePointCount​(CharSequence seq, int beginIndex, int endIndex)");
		staticMethod_codePointCount2();

		p("\n10.public static int codePointOf​(String name)");
		staticMethod_codePointOf();

		p("\n11.public static int compare​(char x, char y)");
		p("\n12.public static int digit​(char ch, int radix)");
		p("\n13.public static int digit​(int codePoint, int radix)");
		p("\n14.public static char forDigit​(int digit, int radix)");
		p("\n15.public static byte getDirectionality​(char ch)");
		p("\n16.public static byte getDirectionality​(int codePoint)");
		p("\n17.public static String getName​(int codePoint)");
		p("\n18.public static int getNumericValue​(char ch)");
		p("\n19.public static int getNumericValue​(int codePoint)");
		p("\n20.public static int getType​(char ch)");
		p("\n21.public static int getType​(int codePoint)");
		p("\n22.public static char highSurrogate​(int codePoint)");
		p("\n23.public static boolean isAlphabetic​(int codePoint)");
		p("\n24.public static boolean isBmpCodePoint​(int codePoint)");
		p("\n25.public static boolean isDefined​(char ch)");
		p("\n26.public static boolean isDefined​(int codePoint)");
		p("\n27.public static boolean isDigit​(char ch)");		
		p("\n28.public static boolean isHighSurrogate​(char ch)");
		p("\n29.public static boolean isIdentifierIgnorable​(char ch)");
		p("\n30.public static boolean isIdentifierIgnorable​(int codePoint)");
		p("\n31.public static boolean isIdeographic​(int codePoint)");
		p("\n32.public static boolean isISOControl​(char ch)");
		p("\n33.public static boolean isISOControl​(int codePoint)");
		p("\n34.public static boolean isJavaIdentifierPart​(char ch)");
		p("\n35.public static boolean isJavaIdentifierPart​(int codePoint)");
		p("\n36.public static boolean isJavaIdentifierStart​(char ch)");
		p("\n37.public static boolean isJavaIdentifierStart​(int codePoint)");
		p("\n38.@Deprecated(since=\"1.1\") public static boolean isJavaLetter​(char ch)");
		p("\n39.public static boolean isLetterOrDigit​(char ch)");
		p("\n40.public static boolean isLetterOrDigit​(char ch)");
		p("\n41.public static boolean isLetter​(int codePoint)");
		p("\n42.public static boolean isLetterOrDigit​(char ch)");
		p("\n43.public static boolean isLetterOrDigit​(int codePoint)");
		p("\n44.public static boolean isLetterOrDigit​(int codePoint)");
		p("\n45.public static boolean isLowerCase​(int codePoint)");
		p("\n46.public static boolean isLowSurrogate​(char ch)");
		p("\n47.public static boolean isMirrored​(char ch)");
		p("\n48.public static boolean isMirrored​(int codePoint)");
		p("\n49.@Deprecated(since=\"1.1\") public static boolean isSpace​(char ch)");
		p("\n50.public static boolean isSpaceChar​(char ch)");
		p("\n51.public static boolean isSpaceChar​(int codePoint)");
		p("\n52.public static boolean isSupplementaryCodePoint​(int codePoint)");
		p("\n53.public static boolean isSurrogate​(char ch)");
		p("\n54.public static boolean isSurrogatePair​(char high, char low)");
		p("\n55.public static boolean isTitleCase​(char ch)");
		p("\n56.public static boolean isTitleCase​(int codePoint)");
		p("\n57.public static boolean isUnicodeIdentifierPart​(char ch)");
		p("\n58.public static boolean isUnicodeIdentifierPart​(int codePoint)");
		p("\n59.public static boolean isUnicodeIdentifierStart​(char ch)");
		p("\n60.public static boolean isUnicodeIdentifierStart​(int codePoint)");
		p("\n61.public static boolean isUpperCase​(char ch)");
		p("\n62.public static boolean isUpperCase​(int codePoint)");
		p("\n63.public static boolean isValidCodePoint​(int codePoint)");
		p("\n64.public static boolean isWhitespace​(char ch)");
		p("\n65.public static boolean isWhitespace​(int codePoint)");
		p("\n66.public static char lowSurrogate​(int codePoint)");
		p("\n67.public static int offsetByCodePoints​(char[] a, int start, int count, int index, int codePointOffset)");
		p("\n68.public static int offsetByCodePoints​(CharSequence seq, int index, int codePointOffset)");
		p("\n69.public static char[] toChars​(int codePoint)");
		p("\n70.public static int toChars​(int codePoint, char[] dst, int dstIndex)");
		p("\n71.public static int toCodePoint​(char high, char low)");
		p("\n72.public static char toLowerCase​(char ch)");
		p("\n73.public static int toLowerCase​(int codepoint)");
		p("\n74.public static char toTitleCase​(char ch)");
		p("\n75.public static int toTitleCase​(int codepoint)");
		p("\n76.public static char toUpperCase​(char ch)");
		p("\n77.public static int toUpperCase​(int codepoint)");
		p("\n78.public static Character valueOf​(char c)");

	}

	private void staticMethod_codePointBefore2() {
		// TODO Auto-generated method stub
		
	}

	private void staticMethod_codePointBefore3() {
		// TODO Auto-generated method stub
		
	}

	private void staticMethod_codePointCount1() {
		// TODO Auto-generated method stub
		
	}

	private void staticMethod_codePointCount2() {
		// TODO Auto-generated method stub
		
	}

	private void staticMethod_codePointOf() {
	    char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' };  
	    p("char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' }; ");	    
		p("Ex = Character.codePointBefore(c1, 2,5): "+Character.codePointBefore(c1, 2,5));
		p("Ex = Negative Case(Runtime ex) - Character.codePointAt(c1, 5,4) ");
		
	}

	private void staticMethod_codePointBefore1() {
	    char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' };  
	    p("char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' }; ");	    
		p("Ex = Character.codePointBefore(c1, 2,5): "+Character.codePointBefore(c1, 2,5));
				
	}

	private void staticMethod_codePointAt2() {
	    char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' };  
	    p("char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' }; ");	    
		p("Ex = Character.codePointAt(c1, 2,5): "+Character.codePointAt(c1, 2,5));
		p("Ex = Negative Case(Runtime ex) - Character.codePointAt(c1, 5,4) ");
		
	}

	private void staticMethod_codePointAt1() {
	    char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' }; 
	    p("char[] c1 = new char[] { 'h', 'e', 'l', 'l', 'o' }; ");	    
		p("Ex = "+Character.codePointAt(c1, 2));
	}

	private void staticMethod_charCount() {
		  int obj1 = 59;  
		    int obj2 = 1546719;  
		       int r1 = Character.charCount(obj1);  
		System.out.println("The first object " + obj1 + " can be represented by "+ r1 + " char values");  
		    int r2 = Character.charCount(obj2);  
		System.out.println("The second object " + obj2 + " can be represented by " + r2 + " char values");  
	}  		
	
}
