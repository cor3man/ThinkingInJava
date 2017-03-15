package com.alis.rtti;

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.NEW;

abstract class Shape {
	public boolean flag;
	void draw() {
		System.out.println(this + ".draw()");
	}
	public void setFlag(Boolean b) {
		flag = b;
	}
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return "Circle " + flag;
	}
}

class Square extends Shape {
	public String toString() {
		return "Square " + flag;
	}
}

class Triangle extends Shape {
	public String toString() {
		return "Triangle " + flag;
	}
}

class Rhomboid extends Shape {
	@Override
	public String toString() {
		return "Rhomboid " + flag;
	}

}

public class Shapes {
	public static void rotate(Shape s) {
/*		if (!(s instanceof Circle)) {
			System.out.println(s.getClass().getSimpleName() + " rotated");
		}
*/	
		
	System.out.println(s.getClass().getName());
	
	}

	public static void main(String[] args) {

	
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for (Shape shape : shapeList) {
			shape.draw();
			rotate(shape);
		}
	}
}
