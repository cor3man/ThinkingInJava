package com.alis.rtti.typeinfo;

import com.alis.rtti.typeinfo.pets.Pet;
import com.alis.rtti.typeinfo.pets.Pets;
import com.alis.util.TypeCounter;

public class PetCount4 {
	  public static void main(String[] args) {
	    TypeCounter counter = new TypeCounter(Pet.class);
	    for(Pet pet : Pets.createArray(20)) {
	      System.out.print(pet.getClass().getSimpleName() + " ");
	      counter.count(pet);
	    }
	    System.out.println();
	    System.out.println(counter);
	  }
	}
