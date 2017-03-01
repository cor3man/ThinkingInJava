package com.alis.rtti;

import java.lang.reflect.Field;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

class X{
	public int c;
	
}

class Candy extends X{
	public int ert;
	static {
		System.out.println("load Candy");
	}
}

class Gum {
	static {
		System.out.println("load Gum");
	}
	public Gum(int i){
		
	}
}

class Cookie {
	static {
		System.out.println("load Cookie");
	}
}


public class SweetShop {
	
	public static String getHierarchy(Class c){
		String sname = c.getSimpleName();
		if (sname.equals("Object")){
			System.out.println(sname);
			for (Field f : c.getDeclaredFields()) {
				System.out.println(f);
			}
			return "";
		}
		
		char ch;
		Character ch1;
		
		
		System.out.println(sname);
		for (Field f : c.getDeclaredFields()) {
			System.out.println(f);
		}
		return getHierarchy(c.getSuperclass());

				
		
		
		
/*		String sname = o.getClass().getSimpleName();	
		System.out.println(sname);
		sname = o.getClass().getSuperclass().getSimpleName();
		System.out.println(sname);
		return "";
*/	}
	
	public static void main(String[] args) {
		Candy candy = new Candy();
		System.out.println(getHierarchy(candy.getClass()));
		char ch;
		
/*		try {
//			System.out.println(args[0]);
			Class.forName("com.alis.rtti.Gum");
//			Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			System.out.println("no Gum");
		}
		new Cookie();
*/	}
}
