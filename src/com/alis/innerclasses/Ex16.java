package com.alis.innerclasses;

public class Ex16 {
	public static class Test{
		
	}
	public class Test1{
		
	}
	public static void main(String[] args) {
		Ex16 ex16 = new Ex16();
		Test1 test1 = ex16.new Test1();
		Test test = new Test();
	}
}
