package assignment8;

interface checking{
	public void check(orders obj);
}

public class program2 {

	public static void main(String[] args) {
		
		orders o1 = new orders(1001,15000,"accepted");
        orders o2 = new orders(1008,21500,"completed");
        orders o3 = new orders(1006,7500,"accepted");
        orders o4= new orders(1079,15000,"dispatched");

        checking c1 = (orders obj)->{
          if (obj.price>10000&&(obj.status.equalsIgnoreCase("accepted")||obj.status.equalsIgnoreCase("completed")))
              obj.display();
        };

        c1.check(o1);
        c1.check(o2);
        c1.check(o3);
        c1.check(o4);
	}

}
