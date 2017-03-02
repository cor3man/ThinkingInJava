package com.alis.rtti.typeinfo.pets;

public class Hamster extends Rodent {
    public Hamster(String name) { super(name); }
    public Hamster() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Hamster> {
		@Override
		public Hamster create() {
			return new Hamster();
		}
	}
 }