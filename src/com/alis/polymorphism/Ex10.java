package com.alis.polymorphism;

public class Ex10 {
	public void f1() {
		System.out.println("f1");
		f2();
	}
	
	public void f2() {
		System.out.println("f2");
	}
	public static void main(String[] args) {
		Ex10 e = new Ex10();
		A a = new A();
		e.f1();
		a.f1();
		e = a;
		e.f1();
		
	}

}

class A extends Ex10{
	@Override
	public void f2(){
		System.out.println("ext f2");
	}
}