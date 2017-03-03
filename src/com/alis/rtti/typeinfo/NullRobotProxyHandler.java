package com.alis.rtti.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import com.alis.util.Null;

class NullRobotProxyHandler implements InvocationHandler {
	private String nullName;
	private Robot proxied = new NRobot();

	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName = type.getSimpleName() + " NullRobot";
	}

	private class NRobot implements Null, Robot {
		public String name() {
			return nullName;
		}

		public String model() {
			return nullName;
		}

		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied, args);
	}
}

