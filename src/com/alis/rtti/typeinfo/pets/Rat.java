package com.alis.rtti.typeinfo.pets;

public class Rat extends Rodent {
    public Rat(String name) { super(name); } 
    public Rat() { super(); }
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Rat> {
		@Override
		public Rat create() {
			return new Rat();
		}
	}
 }