package com.alis.rtti.typeinfo;

import java.util.List;

import com.alis.util.Null;

public interface Robot {
	String name();

	String model();

	List<Operation> operations();

	class Test {
		public static void test(Robot r) {
			if (r instanceof Null)
				System.out.println("[Null Robot]");
			System.out.println("Name: " + r.name());
			System.out.println("Model: " + r.model());
			for (Operation operation : r.operations()) {
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}