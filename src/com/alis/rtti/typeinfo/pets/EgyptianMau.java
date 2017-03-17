package com.alis.rtti.typeinfo.pets;

public class EgyptianMau extends Cat { 
    public EgyptianMau(String name) { super(name); }
    public EgyptianMau() { super(); }
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<EgyptianMau> {
		@Override
		public EgyptianMau create() {
			return new EgyptianMau();
		}
	} 
}