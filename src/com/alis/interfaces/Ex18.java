package com.alis.interfaces;


interface Cycle{
	int getCountCycles();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	private final int n = 1;
	@Override
	public int getCountCycles() {
		return n;
	}
}

class UnicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
	
}
class Bicycle implements Cycle{
	private final int n = 2;
	@Override
	public int getCountCycles() {
		return n;
	}
}

class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
	
}
class Tricycle implements Cycle{
	private final int n = 3;
	@Override
	public int getCountCycles() {
		return n;
	}
}

class TricycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
	
}


public class Ex18 {
	public static void runCycle(CycleFactory factory){
		Cycle cycle = factory.getCycle();
		System.out.println(cycle.getCountCycles());
	}
	
	public static void main(String[] args) {
		runCycle(new BicycleFactory());
		runCycle(new UnicycleFactory());
		runCycle(new TricycleFactory());
	}
}
