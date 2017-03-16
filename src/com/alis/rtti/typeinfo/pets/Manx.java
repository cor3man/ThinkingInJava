package com.alis.rtti.typeinfo.pets;

public class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Manx> {
		@Override
		public Manx create() {
			return new Manx();
		}
	}
 }