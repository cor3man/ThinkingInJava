package com.alis.innerclasses;


public class Parcel9 {
	// ��� ������������� � ���������� ���������� ������
	// ��������� ������ ���� ��������� (final)
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
			//	dest = new String();
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}