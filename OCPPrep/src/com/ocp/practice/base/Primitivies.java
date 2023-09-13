package com.ocp.practice.base;

public class Primitivies extends Base {

	boolean booleanVariable;
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floagVariable;
	double doubleVariable;
	char charVariable;
	
	
	public Primitivies(boolean booleanVariable, byte byteVariable, short shortVariable, int intVariable,
			long longVariable, float floagVariable, double doubleVariable, char charVariable) {
		super();
		this.booleanVariable = booleanVariable;
		this.byteVariable = byteVariable;
		this.shortVariable = shortVariable;
		this.intVariable = intVariable;
		this.longVariable = longVariable;
		this.floagVariable = floagVariable;
		this.doubleVariable = doubleVariable;
		this.charVariable = charVariable;
	}
	
	public static void main(String args[]) {
		
		Primitivies primitives = new Primitivies(true,(byte) 123,(short) 123, 1, 123456789, 1.1f, 12.23232d, 'd');
		
		primitives.validRange();
	}



	private void validRange() {
		p("********Range of primitvies***************");	
		
	      p("1)Integer Datatype values...");
	      p("Min = " + Integer.MIN_VALUE);
	      p("Max = " + Integer.MAX_VALUE);

	      p("\n2)Float Datatype values...");
	      p("Min = " + Float.MIN_VALUE);
	      p("Max = " + Float.MAX_VALUE);

	      p("\n3)Double Datatype values...");
	      p("Min = " + Double.MIN_VALUE);
	      p("Max = " + Double.MAX_VALUE);

	      p("\n4)Byte Datatype values...");
	      p("Min = " + Byte.MIN_VALUE);
	      p("Max = " + Byte.MAX_VALUE);

	      p("\n5)Short Datatype values...");
	      p("Min = " + Short.MIN_VALUE);
	      p("Max = " + Short.MAX_VALUE);
	      
	      p("\n6)Long Datatype values...");
	      p("Min = " + Long.MIN_VALUE);
	      p("Max = " + Long.MAX_VALUE);

	      p("\n7)boolean has only true/false");
	      
	      p("\n8)char Datatype values...");
	      for(int i=0;i<128;i++) {
	    	  p("Decimal : "+i+" , Char : "+(char)i);
	      }
	      p("\n*****Char only support positive values********");

		
	}
	
	
	
	
	
}
