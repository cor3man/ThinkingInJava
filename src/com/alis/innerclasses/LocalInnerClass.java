package com.alis.innerclasses;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {
		// Локальный внутренний класс:
		class LocalCounter implements Counter {
			public LocalCounter() {
				// У локального внутреннего класса
				// может быть собственный конструктор:
				System.out.println("LocalCounter()");
			}

			public int next() {
				System.out.print(name); // Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}

	// To же самое с безымянным внутренним классом:
	Counter getCounter2(final String name) {
		return new Counter() {
			// У безымянного внутреннего класса не может быть
			// именованного конструктора, «легальна» только
			// инициализация экземпляром:
			{
				System.out.println("Counter()");
			}

			public int next() {
				System.out.print(name); // final аргумент
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner "), c2 = lic.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++)
			System.out.println(c1.next());
		for (int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}