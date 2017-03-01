package com.alis.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapData {
	public static Map map(List list, int i){
		Map map = new HashMap<>();
		for (Object object : list) {
			map.put(object, i);
		}
		
		return map;
	}
}
