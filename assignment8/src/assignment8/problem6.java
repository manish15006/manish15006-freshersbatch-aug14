package assignment8;

import java.util.ArrayList;
import java.util.List;

public class problem6 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
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

        System.out.println("Before using replaceALL:");
        System.out.println(list);

        list.replaceAll(str->str.toUpperCase());
        System.out.println("After using replace all: ");
        System.out.println(list);
	}

}
