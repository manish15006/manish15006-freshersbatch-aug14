package JUnitAssignments;

import java.util.Arrays;

public class MinMaxFinder {
	public static int[] findminmax(int [] n)throws InvalidException{
			
			if(n.length==0)
				throw new NullPointerException();
			if(n.length==1)
				throw new InvalidException();
			Arrays.sort(n);
			
			int[]result=new int[2];
			result[0]=n[0];
			result[1]=n[n.length-1];
			return result;
	}

	public MinMax findMinMax(int[] check) {
		// TODO Auto-generated method stub
		return null;
	}
}
