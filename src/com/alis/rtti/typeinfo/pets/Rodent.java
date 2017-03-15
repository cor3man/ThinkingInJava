package com.alis.rtti.typeinfo.pets;

public class Rodent extends Pet {
    public Rodent(String name) { super(name); } 
   public Rodent() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Rodent> {
		@Override
		public Rodent create() {
			return new Rodent();
		}
	}
}
