package com.alis.innerclasses.ex21;

public class A {
	public U getU() {
		return new U(){
			private int i;
			@Override
			public void set(int i) {
				this.i = i;
			}

			@Override
			public int get() {
				return i*5;
			}

			@Override
			public void print() {
				System.out.println("I="+i);
			}
		};
	}
}
