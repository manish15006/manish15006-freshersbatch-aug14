package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class program5 {

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
        Consumer<List<String>> displaylist = list1->list1.forEach(System.out::println);
        System.out.println("list elements: ");
        displaylist.accept(list);
        StringBuilder s = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s1 ->s.append(s.charAt(0)));
        modify.accept(list);

        System.out.println("String with first letter of list elements:");
        System.out.println(s);
	}

}
