package java_Assignment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class program2 {

	public static void main(String[] args) {
		// creating ArrayList and adding objects
		ArrayList<String> obj=new ArrayList<>();
		obj.add("Ironman");
		obj.add("Captain America");
		obj.add("Thor");
		obj.add("Shang Chi");
		obj.add("Captain Marvel");
		obj.add("Spiderman");
		obj.add("War-Machine");
		obj.add("Black-Widow");
		obj.add("Hulk");
		obj.add("Doctor Strange");
		obj.add("Doctor Strange");
		//creating HashSet and adding objects
		HashSet<String> set=new HashSet<String>(obj);
		set.add("Hulk");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
