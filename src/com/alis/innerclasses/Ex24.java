package com.alis.innerclasses;

class Outer {
	class Inner {
		public Inner(int i){
			
		}
	}
}


public class Ex24 {
	class InnerW24 extends Outer.Inner{

		public InnerW24(Outer outer, int i) {
			outer.super(i);
		}
		
	}
}
