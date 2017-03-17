package com.alis.rtti.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {

	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = { "com.alis.rtti.typeinfo.pets.Mutt", "com.alis.rtti.typeinfo.pets.Pug", "com.alis.rtti.typeinfo.pets.EgyptianMau",
			"com.alis.rtti.typeinfo.pets.Manx", "com.alis.rtti.typeinfo.pets.Cymric", "com.alis.rtti.typeinfo.pets.Rat", "com.alis.rtti.typeinfo.pets.Mouse",
			"com.alis.rtti.typeinfo.pets.Hamster","com.alis.rtti.typeinfo.pets.Gerbil"  };

	@SuppressWarnings("unchecked")
	// загрузчик списка классов
	private static void loader() {
		try { // при загрузке класс приводится к типу заданному типизациии
				// контейнера
			for (String name : typeNames)
				types.add((Class<? extends Pet>) Class.forName(name));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	// статический блок ОДНОКРТАНО загружающий список при инициализации данного
	// класса
	static {
		loader();
	}

	@Override
	public List<Class<? extends Pet>> getTypes() {
		return types;
	}
}
