package corejava_assignment1;

public class program8 {
	static void bubblesort(int[]array) {
		int num=array.length;
		int temp=0;
		for(int i=0;i<num;i++) {
			for(int j=1;j<(num-i);j++) {
				if (array[j-1]>array[j]) {
					//swap elements
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("array before bubble sort");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		bubblesort(array);//sorting array element usng buuble sort
		System.out.println("array after bubble sort");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}

	}

}
