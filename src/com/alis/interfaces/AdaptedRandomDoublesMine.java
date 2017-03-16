package com.alis.interfaces;

import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDoublesMine extends RandomDoubles implements Readable {
	private int count;

	public AdaptedRandomDoublesMine(int count) {
		this.count = count;
	}

	//@Override
	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoublesMine(7));
		while (s.hasNextDouble())
			System.out.print(s.nextDouble() + " ");
	}
}
