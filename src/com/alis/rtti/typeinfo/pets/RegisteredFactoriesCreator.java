package com.alis.rtti.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

import com.alis.rtti.typeinfo.factory.Factory;

public class RegisteredFactoriesCreator extends FabricPatCreater{

	static List<Factory<? extends Pet>> list = new ArrayList<>();
	static {
		list.add(new Pet.Factory());
		list.add(new Cymric.Factory());
		list.add(new Dog.Factory());
		list.add(new EgyptianMau.Factory());
		list.add(new Gerbil.Factory());
		list.add(new Hamster.Factory());
		list.add(new Manx.Factory());
		list.add(new Mouse.Factory());
		list.add(new Mutt.Factory());
		list.add(new Pug.Factory());
		list.add(new Rat.Factory());
		list.add(new Rodent.Factory());
	}
	
	public List<Factory<? extends Pet>> getTypes() {
		// TODO Auto-generated method stub
		return list;
	}

}
