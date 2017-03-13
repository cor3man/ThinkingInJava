package com.alis.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//: typeinfo/toys/ToyTest.java
//Testing class Class.

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}
interface AnotherOne {
	
}

class Toy {
	// Закомментируйте следующий далее конструктор по
	// умолчанию, тогда в строке с пометкой (*1*)
	// возникнет ошибка NoSuchMethodError
	public int i;
	Toy() {
	}

	Toy(int i) {
		this.i = i;
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, AnotherOne {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Имя класса: " + cc.getName() + " это интерфейс?[" + cc.isInterface() + "]");
		System.out.println("Простое имя: " + cc.getSimpleName());
		System.out.println("Каноническое имя: " + cc.getCanonicalName());
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("com.alis.rtti.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("He найден класс FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		
		try {
			Constructor<?> constructor;// = up.getConstructor(int.class);
			constructor = up.getDeclaredConstructor(int.class);
			constructor.setAccessible(true);
			try {
				obj = constructor.newInstance(35);
				System.out.println(((Toy)obj).i);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		try {
			// Необходим конструктор по умолчанию:
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("He удалось создать объект");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Нет доступа");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}