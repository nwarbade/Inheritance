package com.hierarchicalInheritance;

public class MasterClass {
	
	public static void main(String[] args) {
		
		RBI a = new RBI ();
		a.parentBank();
		
		
		SBI  b = new SBI ();
		b.stateBankOfIndia();
		
		PNB c = new PNB ();
		c.punjabNationalBank();
		
		BOM d = new BOM ();
		d.bankOfMaharashtra();
	}

}
