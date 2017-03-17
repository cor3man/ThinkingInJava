package com.alis.innerclasses;

public class Ex1 {
	
	private String s;
	
	public Ex1() {
		s = this.toString();
		System.out.println("constr Ex1");
		System.out.println(this);
	}
	
	class Inner{
		public Inner() {
			System.out.println("constr Inner");
		}
		@Override
		public String toString() {
			return s;
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		Inner inner = new Ex1().getInner();
		
		System.out.println(inner);
		Ex1 ex1 = new Ex1();
		ex1.new Inner();
	}

}
