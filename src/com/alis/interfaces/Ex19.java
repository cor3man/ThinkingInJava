package com.alis.interfaces;

import java.util.Random;

public class Ex19 {


	static void drop(Factory factory) {
		System.out.println(factory.getObj().getDrop());
	}
	public static void main(String[] args) {
		drop(new CoinFactory());
		drop(new DiceFactory());
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
}

class Dice implements Dropable {
	@Override
	public int getDrop() {
		Random random = new Random(System.nanoTime());
		return random.nextInt(6);
	}
}

class CoinFactory implements Factory {
	@Override
	public Dropable getObj() {
		// TODO Auto-generated method stub
		return new Coin();
	}
}

class DiceFactory implements Factory {
	@Override
	public Dropable getObj() {
		// TODO Auto-generated method stub
		return new Dice();
	}
}