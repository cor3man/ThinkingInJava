package com.alis.innerclasses;



public class Ex17 {
	public static class C1{
		public static class C2{
			public class C3{
				
			}
		}
	}
	public static void main(String[] args) {
		Ex17 ex17 = new Ex17();
	//	C1 c1 = ex17.new C1();
		//C2 c2 = c1.new C2();
		
	}
}

class Test555{
	void m() {
		Ex17 ex17 = new Ex17();
	//	Ex17.C1 c1 = ex17.new C1();
	//	C2 c2 = c1.new C2();
	//	C3 c3 = c2.new C3();
		
	}
}

