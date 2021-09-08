package assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class program3 {

	public static void main(String[] args) {
		

		ArrayList<String> a= new ArrayList<>();
		a.add("Tony is an Ironman");
		a.add("IronMan suit developed by Tony");
		//a.add("bruce");
		//before swapping
		System.out.println("array list before exchanging:");
		for(String temp:a) {
			System.out.println(temp);
		}
		//after swapping
		Collections.swap(a, 0, 1);
		System.out.println("----------------------------------");
		System.out.println("array list after exchanging:");
		for(String temp:a) {
			System.out.println(temp);
		}
	}

}
