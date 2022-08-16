import java.util.*;

public class Exercise_21_7 {
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";
		
		
		
		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new HashMap<>();
		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((map1, map2) -> map1.getValue().compareTo(map2.getValue()) == 0 ? map1.getKey().compareTo(map2.getKey()): map1.getValue().compareTo(map2.getValue()));
		for(Map.Entry<String, Integer> entry:list) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		// Display key and value for each entry
		//map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}