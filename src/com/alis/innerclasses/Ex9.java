package com.alis.innerclasses;

interface Swimable{
	
}


public class Ex9 {

	private class Fish implements Swimable{
		void p() {
			
		}
	}
	
	public Swimable getFish() {
		return new Fish();
	}
	
	public void test() {
		Swimable s = getFish();
		((Fish)s).p();
	}
	
	
}

class TT1{
	public void met() {
		Ex9 e = new Ex9();
		Swimable s = e.getFish();
	//	((Ex9.Fish)s).p();
		
	}
}
