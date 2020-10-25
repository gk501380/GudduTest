package HashMaps;

import java.util.*;
import java.util.Map.Entry;

public class SimpleHashMap {
	public static void main(String[] args) {
	Map<String	,Integer> number=new HashMap<>();
	
		
	number.put	("one",1);
	number.put("two",2);
	number.put("three",3);
	number.put("four",4 );
	number.put("five",5);
	number.put("six",6);
	number.put("seven",7);
	number.put("eight",8);
	number.put("nine",9);
	number.put("ten",10);
	number.put("eleven",11);
	number.put("twelve",12);
	number.put("thrteen",13);
	number.put("fourteen",14);
	number.put("fifteen",15);
	number.put("sixteen",16);
	number.put("seventeen",17);
	number.put("eighteen",18);
	number.put("five",5);
	
	
	number.remove("two",4);
	
	System.out.println(number);
	System.out.println(number.get(2));
	System.out.println(number.keySet());
	System.out.println(number.values());
	System.out.println(number.entrySet());
	
	Set<Entry<String,Integer>>entries=number.entrySet();
	
	
	for (Entry< String, Integer>entry:entries) {
		entry.setValue(entry.getValue()*17);
	}
	
	System.out.println(number);
	}
	
	 

}
