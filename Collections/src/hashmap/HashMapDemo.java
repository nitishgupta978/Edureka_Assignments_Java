package hashmap;

import java.util.HashMap;
/**
 * 
 * @author nitish.gupta_spicemo
 *
 */

public class HashMapDemo {
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
   
        map.put("Nitish Kumar", 10);
        map.put("Ravi", 30);
        map.put("Kishan", 20);
        map.put("vishal", 20);
        map.put("vaibhav", 20);
 
        System.out.println(map);
		
	}

}
