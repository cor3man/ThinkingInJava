package com.alis.rtti.typeinfo.pets;

public class Mutt extends Dog {
    public Mutt(String name) { super(name); } 
    public Mutt() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Mutt> {
		@Override
		public Mutt create() {
			return new Mutt();
		}
	}
 }
