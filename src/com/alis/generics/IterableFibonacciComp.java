package com.alis.generics;

import java.util.Iterator;

public class IterableFibonacciComp implements Iterable<Integer>{
	private int n;
	private Fibonacci fibonacci = new Fibonacci();
	public IterableFibonacciComp(int count) {
		n = count;
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return fibonacci.next();
			}
		};
	}
		
	public static void main(String[] args) {
		IterableFibonacciComp fib = new IterableFibonacciComp(18);
		for (Integer integer : fib) {
			System.out.print(integer+" ");
		}
	}
}
