package com.alis.innerclasses;

import com.alis.innerclasses.test.Ex6;

public class implEx6 {
	protected void print(){
		
	}
	
	protected class Impl implements Ex6{

		@Override
		public void set() {
			System.out.println("testEx6");
		}
		
	}
}
