package com.alis.innerclasses.ex21;

import java.util.ArrayList;

public class B {
	private ArrayList<U> list = new ArrayList<>();
	public void put(U u) {
		list.add(u);
	}
	public void setNull(U u) {
		if (list.contains(u)) list.set(list.indexOf(u), null);
	}
	public void invoke() {
		for (U u : list) {
			u.set((int)(System.currentTimeMillis()%100000000));
			System.out.println(u.get());
			u.print();
		}
	}
	public static void main(String[] args) {
		B b = new B();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		
		b.put(a1.getU());
		b.put(a2.getU());
		b.put(a3.getU());
		b.put(a4.getU());
		
		b.invoke();
	}
}
