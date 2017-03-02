package com.alis.rtti.typeinfo.pets;

public class Dog extends Pet {
    public Dog(String name) { super(name); } 
    public Dog() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Dog> {
		@Override
		public Dog create() {
			return new Dog();
		}
	}
 }