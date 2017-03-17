package com.alis.innerclasses;

public class Ex7 {
	private int a;
	private void method(){
		
	}
	public void m2(){
		C c = new C();
		c.ch();
		c.l = 5;
	}
	class C{
		private int l;
		
		public void ch(){
			a=0;
			method();
		}
	}
}
