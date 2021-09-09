package JUnitAssignments;

import java.util.Arrays;

public class program2 {
	
	public static MinMax findMinMax(int [] a) throws InvalidException {
		
		if(a.length==0)
			throw new NullPointerException();
		if(a.length==1) 
			throw new InvalidException();
		Arrays.sort(a);
		
		MinMax obj = new MinMax(a[0],a[a.length-1]);
		return obj;
	}
}
