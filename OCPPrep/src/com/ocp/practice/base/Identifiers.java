package com.ocp.practice.base;

public class Identifiers extends Base {

	public static void main(String args[]) {
		Identifiers identifiers = new Identifiers();
		identifiers.displayRules();
		identifiers.validCases();
		identifiers.invalidCases();
	}

	private  void invalidCases() {
		p("\n************Invalid cases(compile failed)************");
		p("1)start with numeric\n" + 
				"int 12variable=1;\n" + 
				"\n" + 
				"2)reserve word\n" + 
				"int switch=12;\n" + 
				"\n" + 
				"3)_ as identifier\n" + 
				"int _ = 1;");
		
	}

	private  void validCases() {
		p("\n************valid cases************");
		
		p("1)Names can contain letters, digits, underscores, and dollar signs.");
		int firstVariable = 1;
		int variable2=2;
		int $=3;
		p("Ex :- firstVariable:"+firstVariable+", variable2:"+variable2+", $:"+$);
		
		p("3)Must begin with a letter or $ or _ .");
		int $variable=4;
		int _variable=5;
		p("Ex :- $variable:"+$variable+", _variable:"+_variable);
		
		p("4)Names are case sensitive (\"myVar\" and \"myvar\" are different variables)");
		int variable=6;
		int vaRiable=7;
		p("Ex :- variable:"+variable+", vaRiable:"+vaRiable);
		
		
	}

	private void displayRules() {
		p("\n*************IDENTIFIER_RULES*************");
		p("1)Names can contain letters, digits, underscores, and dollar signs.\n"
				+ "2)Names must begin with a letter.Must not start with numericals but came later.\n" + 
				"3)Must begin with a letter or $ or _ .\n" + 
				"4)Names are case sensitive (\"myVar\" and \"myvar\" are different variables).\n" + 
				"5)Reserved words (like Java keywords, such as int or boolean) cannot be used as names.\n" + 
				"6)As of java 9 single _ cannot be a identifier.\n"
				+ "7)Java identifiers are case-sensitive.\n" );
	}
}
