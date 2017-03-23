package test.test1;

import test.*;

public class TestPrivateInherit {
	public static void main(String[] args) {
		A a = new B();
		//a.meth();
		B b = new B();
		b.meth();
	}
}
