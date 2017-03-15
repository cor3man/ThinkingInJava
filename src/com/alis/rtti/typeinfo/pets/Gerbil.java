package com.alis.rtti.typeinfo.pets;

public class Gerbil extends Rodent{
	public Gerbil(String name) {super(name);}
	public Gerbil(){super();}
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Gerbil> {
		@Override
		public Gerbil create() {
			return new Gerbil();
		}
	}

}
