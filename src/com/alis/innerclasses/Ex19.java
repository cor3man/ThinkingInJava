package com.alis.innerclasses;

public interface Ex19 {
	
	void print();
	
	class Inner{
		static void getName(Ex19 ex19) {
			ex19.print();
		}
	}
}



