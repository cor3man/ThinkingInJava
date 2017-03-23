package com.alis.rtti.typeinfo.pets;



public class Cat extends Pet {
    public Cat(String name) { super(name); } 
    public Cat() { super();} 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Cat> {
		@Override
		public Cat create() {
			return new Cat();
		}
	}
 }
