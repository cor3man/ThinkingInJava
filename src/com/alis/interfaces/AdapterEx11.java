package com.alis.interfaces;

import com.alis.interfaces.interfaceprocessor.Apply;
import com.alis.interfaces.interfaceprocessor.Processor;

public class AdapterEx11 extends ReversCharsEx11 implements Processor{

	@Override
	public String name() {
		return ReversCharsEx11.class.getSimpleName();
	}

	@Override
	public Object process(Object input) {
		return reverse((String)input);
	}
	
	public static void main(String[] args) {
		Apply.process(new AdapterEx11(), "qwqwqw");
	}

}
