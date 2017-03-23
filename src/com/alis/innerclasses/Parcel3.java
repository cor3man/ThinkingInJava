package com.alis.innerclasses;

public class Parcel3 {
	int i;
	class Contents {
		private int i = 11;

		public int value() {
			Parcel3.this.i = i*2;
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		// Для создания экземпляра внутреннего класса
		// необходимо использовать экземпляр внешнего класса
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
		System.out.println(c.value() + " " + p.i);
	}
}