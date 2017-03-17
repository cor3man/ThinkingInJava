package com.alis.util;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;

	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	public T next() {
		try {
			// Assumes type is a public class:
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// Получение генератора по умолчанию для заданного type:
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
}
