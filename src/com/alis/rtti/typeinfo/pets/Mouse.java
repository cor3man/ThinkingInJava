package com.alis.rtti.typeinfo.pets;

public class Mouse extends Rodent {
    public Mouse(String name) { super(name); }
    public Mouse() { super(); }
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<Mouse> {
		@Override
		public Mouse create() {
			return new Mouse();
		}
	}
 }