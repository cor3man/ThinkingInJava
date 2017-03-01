package com.alis.rtti.typeinfo.pets;

import java.util.*;

public class LiteralPetCreator extends PetCreator {

	@SuppressWarnings("unchecked")
	// список ВСЕХ возможных типов животных непосредственно инициализированный
	// литералами классов
	// сделан неизменяемым ни по размеру ни по значениям
	public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(// метод
																							// создает
																							// "read-only"
																							// коллекцию
			Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class,
					Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class)); // Типы
																						// для
																						// случайного
																						// создания:
	// а это уже "рабочий список" типов животных ))
	private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),
			allTypes.size());

	@Override
	public List<Class<? extends Pet>> getTypes() {
		return types;
	}

	public static void main(String[] args) {
		System.out.println(types);
	}
}
