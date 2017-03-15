package com.alis.rtti.typeinfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

interface Interface {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface {
	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse " + arg);
	}
	
	public void print() {
		System.out.println("ADFsdfDSF");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "okokok!";
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
	
	
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}

	@Override
	public void doSomething() {
		System.out.println("Invocation time is " + sdf.format(cal.getTime()));
		System.out.println(System.nanoTime());
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("Invocation time is " + sdf.format(cal.getTime()));
		System.out.println(System.nanoTime());
		proxied.somethingElse(arg);
	}
}

class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
