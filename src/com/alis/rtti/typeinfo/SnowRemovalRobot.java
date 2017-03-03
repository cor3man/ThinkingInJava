package com.alis.rtti.typeinfo;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot implements Robot {
	private String name;

	public SnowRemovalRobot(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public String model() {
		return "SnowBot Series 11";
	}

	public List<Operation> operations() {
		return Arrays.asList(new Operation() {
			public String description() {
				return name + " может убирать снег";
			}

			public void command() {
				System.out.println(name + "  убирает снег");
			}
		}, new Operation() {
			public String description() {
				return name + "  может колоть лед";
			}

			public void command() {
				System.out.println(name + " колет лед");
			}
		}, new Operation() {
			public String description() {
				return name + " может чистить крышу";
			}

			public void command() {
				System.out.println(name + " чистит крышу");
			}
		});
	}

	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}
}
