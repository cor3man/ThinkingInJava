package com.alis.interfaces;

public class TestEx4 extends AbstrWithoutMethEx4{
	public void method() {
		System.out.println("test");
	}
	public static void stMethod(AbstrWithoutMethEx4 ma) {
		((TestEx4)ma).method();
	}
	public static void main(String[] args) {
		TestEx4.stMethod(new TestEx4());
	}
}
