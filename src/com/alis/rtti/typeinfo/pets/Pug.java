package com.alis.rtti.typeinfo.pets;

public class Pug extends Dog {
    public Pug(String name) { super(name); } 
    public Pug() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Pug> {
		@Override
		public Pug create() {
			return new Pug();
		}
	}
}
