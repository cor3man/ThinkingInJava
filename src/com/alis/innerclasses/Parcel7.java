package com.alis.innerclasses;

interface S<T> {
	
}

public class Parcel7 implements S<Integer>{
	public Contents contents() {
		return new Contents() {// Вставить определение класса
			private int i = 11;

			public int value() {
				return i;
			}
		}; // В данной ситуации точка с запятой необходима
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
