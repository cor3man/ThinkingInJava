
package com.alis.rtti.typeinfo;

import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
    Calendar cal;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy. " + proxy.getClass() + ", method- " + method + ", args " + args);
		if (args != null)
			for (Object arg : args)
				System.out.println(" " + arg);
		cal = Calendar.getInstance();
		System.out.println("Invocation time is " + sdf.format(cal.getTime()));
		System.out.println(System.nanoTime());
		//System.out.println(proxy.toString());

		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		// Вставляєм посредника и вызываем снова:
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[] { Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}