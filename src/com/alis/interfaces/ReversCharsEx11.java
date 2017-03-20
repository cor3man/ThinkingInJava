package com.alis.interfaces;

public class ReversCharsEx11 {

	public String reverse(String s) {
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < (charArray.length - 1); i+=2) {
			char c = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1] = c;
		}
		s = String.valueOf(charArray);
		return s;
	}
	public static void main(String[] args) {
		ReversCharsEx11 r = new ReversCharsEx11();
		System.out.println(r.reverse("qwqwqw"));
	}
}
