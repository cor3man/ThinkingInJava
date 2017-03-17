package com.alis.rtti;

import java.util.ArrayList;

import com.alis.rtti.typeinfo.pets.Rat;

public class GetAllClasses {
	
	public void print(Class<?> c) {
		if (c.getSuperclass() != null) print(c.getSuperclass());
		System.out.println(c.getName());
	}
	public static void main(String[] args) {
		GetAllClasses getAllClasses = new GetAllClasses();
		Character character[] = new Character[34];
		char c[] = {'f','f'};
		getAllClasses.print(character.getClass());
		try {
			getAllClasses.print(Class.forName("java.util.ArrayList"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
