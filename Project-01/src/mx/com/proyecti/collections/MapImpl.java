package mx.com.proyecti.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {

		Map<String, String> partMap = new TreeMap<>();
		
		partMap.put("s0001", "Blue Polo Shirt");
		partMap.put("s002", "Black Polo Shirt");
		partMap.put("h001", "Duke Hat");
		
		partMap.put("s002", "Yellow Shirt");
		
		Set<String> keys = partMap.keySet();
		
		System.out.println("--- Part Map ----");
		for(String key: keys) {
			System.out.println("Part # " + key + " " + partMap.get(key));
		}

	}

}
