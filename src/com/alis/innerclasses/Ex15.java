package com.alis.innerclasses;

import java.util.Random;


public class Ex15 {


	static void drop(Factory factory) {
		System.out.println(factory.getObj().getDrop());
	}
	public static void main(String[] args) {
		drop(Coin.factory());
		drop(Dice.factory());
	}
	
}

interface Dropable {
	int getDrop();
}

interface Factory {
	Dropable getObj();
}

class Coin implements Dropable {
	@Override
	public int getDrop() {
		Random random = new Random(System.nanoTime());
		return random.nextInt(2);
	}
	public static Factory factory() {
		return new Factory() {
			
			@Override
			public Dropable getObj() {
				return new Coin();
			}
		};
	}
}

class Dice implements Dropable {
	@Override
	public int getDrop() {
		Random random = new Random(System.nanoTime());
		return random.nextInt(6);
	}
	public static Factory factory() {
		return new Factory() {
			
			@Override
			public Dropable getObj() {
				return new Dice();
			}
		};
	}
}
