package com.alis.rtti.typeinfo;

import java.util.ArrayList;
import java.util.Random;
import com.alis.rtti.typeinfo.factory.*;
import java.util.*;

class Part {

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

	static {
		// При вызове Collections addAll() выдается предупреждение
		// "unchecked generic array creation for varargs parameter"
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);

	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	// Создание фабрики для каждого конкретного типа
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<FuelFilter> {
		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<AirFilter> {
		@Override
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

class CabinAirFilter extends Filter {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<CabinAirFilter> {
		@Override
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<OilFilter> {
		@Override
		public OilFilter create() {
			return new OilFilter();
		}
	}
}

class Belt extends Part {
}

class FanBelt extends Belt {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<FanBelt> {
		@Override
		public FanBelt create() {
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<GeneratorBelt> {
		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt {
	public static class Factory implements com.alis.rtti.typeinfo.factory.Factory<PowerSteeringBelt> {
		@Override
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}

public class RegisteredFactories {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(Part.createRandom());
	}
}
