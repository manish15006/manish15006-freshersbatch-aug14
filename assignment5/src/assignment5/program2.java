package assignment5;

import java.util.HashMap;
import java.util.Map.Entry;

public class program2 {

	public static void main(String[] args) {
		
		HashMap <Integer,Double> map=new HashMap<>();
		map.put(1001, 1100.0);
		map.put(1002, 1200.0);
		map.put(1003, 1300.0);
		map.put(1004, 1400.0);
		map.put(1005, 1500.0);
		map.put(1006, 1600.0);
		map.put(1007, 1700.0);
		map.put(1008, 1800.0);
		map.put(1009, 1900.0);
		map.put(1010, 2000.0);
		System.out.println("size of map:" +map.size());
		System.out.println("----------------------");
		for(Entry<Integer, Double> a :map.entrySet())
			System.out.println("key: "+a.getKey()+" "+"value: "+a.getValue());
		System.out.println("-----------------------");
		System.out.println("end of the program");
	}

}
