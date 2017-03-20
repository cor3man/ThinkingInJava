package com.alis.innerclasses;

interface Selector {
	boolean end();

	Object current();

	void next();
}

class Str{
	private static int count;
	private String s;
	public Str() {
		count++;
		s = "Str" + count;
	}
	@Override
	public String toString() {
		return s;
	}
}

class Test{
	private int test;
}

public class Sequence extends Test{
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public Sequence getSequence(){
			return Sequence.this;
		}
		
		public boolean end() {
	//		test = 5;
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(new Str());
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}