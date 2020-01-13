package MyTest;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class Test6 {
	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<>();
		map.put("abc@gmail.com", "abc@123");
		map.put("xyz@gmail.com", "hasijas");
		map.put("abc@yahoomail.com", "abc@123");
		System.out.println(map.size());
		System.out.println(map.get("abc@gmail.com"));
		
		System.out.println("");
		
		Set<String> keys = map.keySet();
		for(String k:keys)
			System.out.println(k+" "+map.get(k));
		
		Collection<String> values  = map.values();
		for(String s:values)
			System.out.println(s+" "+map.get(s));
		
		
		map.forEach((k, v) -> {
			System.out.println(k +" " +v);
		});
		
		System.out.println("");
		
		Set<Entry<String,String>> set =  map.entrySet();
		for(Entry<String, String> s : set)
			System.out.println(s.getKey()+" "+s.getValue());
			
	}

}
