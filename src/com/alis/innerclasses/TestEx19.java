package com.alis.innerclasses;


class TestEx19 implements Ex19 {

	@Override
	public void print() {
		System.out.println("qwer");
	}

	public static void main(String[] args) {
		TestEx19 testEx19 = new TestEx19();
		Inner.getName(testEx19);
	}

}