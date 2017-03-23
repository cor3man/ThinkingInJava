package com.alis.innerclasses;

public interface Ex18 {
	class Inner{}
}

class ImplEx18 implements Ex18{
	public static void main(String[] args) {
		ImplEx18 implEx18 = new ImplEx18();
		Inner inner = new Inner();
	}
}