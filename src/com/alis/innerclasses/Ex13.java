package com.alis.innerclasses;

public class Ex13 {
	public Dop getDop() {
		return new Dop(10) {

			void s() {
				
			}
		};
	}
}

class Dop{
	public Dop(int i) {
		
	}
}