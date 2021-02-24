package collections;
import java.util.HashMap;
import java.util.Map;

public class hashmapp {
	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<>();
		print(map);
		map.put("aman", 30);
		map.put("ritik", 21);
		map.put("rekha", 23);
		map.put("shruti", 21);
		map.put("molu", 27);
		System.out.println(map);
		//----------------
		System.out.println("----------------");
		System.out.println("size of the map is:"+map.size());
		//----------------
		System.out.println("----------------");
		if(map.containsKey("molu")) {
			Integer s = map.get("molu"); 
			System.out.println("the key of molu is:"+s);
		}
		//----------------
		System.out.println("----------------");
		
		map.clear();
		print(map);
	}
		public static void print(Map<String , Integer> map) {
			if(map.isEmpty()) {
				System.out.println("map is empty");
			}
			else {
				System.out.println(map);
			}
			
		}
		
	}

	
	