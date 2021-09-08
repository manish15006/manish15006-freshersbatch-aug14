package assignment8;

import java.util.ArrayList;
import java.util.List;

public class program4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
        list.add("marvel studios");
        list.add("IronMan");
        list.add("Spiderman");
        list.add("Shang-Chi");
        list.add("Black widow");
        list.add("Hulk");
        list.add("Thor");
        list.add("Ultron");
        list.add("Captian America");
        list.add("Captain Marvel");
        list.removeIf(m->m.length()%2!=0);
        list.forEach(System.out::println);
	}

}
