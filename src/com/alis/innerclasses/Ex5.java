package com.alis.innerclasses;

public class Ex5 {
	public void test(){
		DotNew dotNew = new DotNew();
		DotNew.Inner inner = dotNew.new Inner();
	}
}
