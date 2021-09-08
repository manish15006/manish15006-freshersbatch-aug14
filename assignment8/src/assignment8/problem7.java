package assignment8;

import java.util.HashMap;
import java.util.Set;

public class problem7 {

	public static void main(String[] args) {
		HashMap<Integer,String > hashMap = new HashMap<>();
        hashMap.put(1,"IronMan");
        hashMap.put(2,"Captain Marvel");
        hashMap.put(3,"Thor");
        hashMap.put(4,"Shang-Chi");
        hashMap.put(5,"Docter Strange");
        Set s = hashMap.entrySet();
        StringBuilder str = new StringBuilder();
        s.forEach(str1->str.append(str1));
        System.out.println(str);
	}

}
