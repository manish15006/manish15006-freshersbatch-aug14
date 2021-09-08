package assignment8;

public class orders {
	int id;
    int price;
    String status;

    public orders(int id, int price, String status) {
        this.id=id;
        this.price=price;
        this.status=status;
    }

	public void display() {
		System.out.println("orders [id=" + id + ", price=" + price + ", status=" + status + "]");	}
    
}
