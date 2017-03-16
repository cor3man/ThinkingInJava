package com.alis.generics;

import com.alis.util.*;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
	}
}