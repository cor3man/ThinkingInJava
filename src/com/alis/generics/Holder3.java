package com.alis.generics;

import com.alis.rtti.typeinfo.pets.Cat;
import com.alis.rtti.typeinfo.pets.Pet;

class Automobile{}

public class Holder3 <T>{
	private T a;
	public Holder3(T a) {this.a = a;}
	public void set(T a) {this.a = a;}
	public T get() {return a;}
	public static void main(String[] args) {
		Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());
		Automobile automobile = holder3.get();
		Holder3<Pet> pet = new Holder3<Pet>(new Pet());
		pet.set(new Cat());

		Holder3<Cat> cat = new Holder3<Cat>(new Cat());
		//cat.set(new Pet());
		
		//holder3.set(12);
		
	}
	
}
