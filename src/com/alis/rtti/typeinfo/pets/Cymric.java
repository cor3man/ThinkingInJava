package com.alis.rtti.typeinfo.pets;

public class Cymric extends Manx {
    public Cymric(String name) { super(name); } 
    public Cymric() { super(); } 
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Cymric> {
		@Override
		public Cymric create() {
			return new Cymric();
		}
	}

 }
