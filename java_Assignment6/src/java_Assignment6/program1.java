package java_Assignment6;

import java.util.TreeMap;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,String> map=new TreeMap<Long,String>();
		
		map.put((long) 101, "vimal");
		map.put((long) 102, "suresh");
		map.put((long) 103, "ramesh");
		
		
		System.out.println("all the keys: "+map.keySet());
		System.out.println("all the values: "+map.values());
		System.out.println("all key-value pairs: "+map.keySet()+map.values());
		System.out.println("descendingMap: "+map.descendingMap());
	}

}
