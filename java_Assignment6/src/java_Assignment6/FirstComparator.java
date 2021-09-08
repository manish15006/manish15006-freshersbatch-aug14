package java_Assignment6;

import java.util.Comparator;

public class FirstComparator implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return (o1.id).compareTo(o2.id);
	}
	
}
