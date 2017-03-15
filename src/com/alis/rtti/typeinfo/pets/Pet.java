package com.alis.rtti.typeinfo.pets;

public class Pet extends Individual {
    public Pet(String name) { super(name); } 
    public Pet () { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Pet> {
		@Override
		public Pet create() {
			return new Pet();
		}
	}
 }