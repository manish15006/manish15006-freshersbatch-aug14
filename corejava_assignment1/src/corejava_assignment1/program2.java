package corejava_assignment1;

public class program2 {

	public static void main(String[] args) {
		// armstrong numbers falling in the range 100 to 999
		System.out.println("armstrong numbers from 100 to 999");
		for(int i=100;i<=999;i++) {
			int m=i;
			int r=0;
			int f=0;
			
			while(m>0) {
				r=m%10;
				f+=(r*r*r);
				m=m/10;
			}
			if(i==f) {
				System.out.println(i+ " "+"is armstrong number" );
			}
			
		}

	}

}
