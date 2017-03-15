package com.alis.rtti.typeinfo;

import com.alis.rtti.typeinfo.pets.*;
import java.util.*;

public class PetCount {

	static class PetCounter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null)
				put(type, 1);
			else
				put(type, quantity + 1);
		}
	}

	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for (Pet pet : creator.createArray(20)) { // Подсчет всех объектов Pet:
			System.out.print(pet.getClass().getSimpleName() + " ");

			if (pet instanceof Pet)
				counter.count("Pet");
			if (pet instanceof Dog)
				counter.count("Dog");
			if (pet instanceof Mutt)
				counter.count("Mutt");
			if (pet instanceof Pug)
				counter.count("Pug");
			if (pet instanceof Cat)
				counter.count("Cat");
			if (pet instanceof Manx)
				counter.count("EgyptіanMau");
			if (pet instanceof Manx)
				counter.count("Manx");
			if (pet instanceof Manx)
				counter.count("Cymric");
			if (pet instanceof Rodent)
				counter.count("Rodent");
			if (pet instanceof Rat)
				counter.count("Rat");
			if (pet instanceof Mouse)
				counter.count("Mouse");
			if (pet instanceof Hamster)
				counter.count("Hamster");
			if (pet instanceof Gerbil)
				counter.count("Gerbil");
		}
		// Вывод результатов подсчета.
		System.out.println();
		System.out.println(counter);
	}

	public static void main(String[] args) {
		// countPets(new ForNameCreator());
		countPets(new ForNameCreator());
		countPets(new LiteralPetCreator());
	}
}