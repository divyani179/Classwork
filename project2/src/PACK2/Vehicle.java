package PACK2;

public class Vehicle {
 String name;
 int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Vehicle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
void getfeatures(){
	System.out.println("name :"+" "+name);
    System.out.println("price"+" "+price);
    
}
void getmileage(){
	
}
}
class Car extends Vehicle{

	public Car(String name, int price) {
		super(name, price);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	void getmileage() {
		// TODO Auto-generated method stub
		super.getmileage();
	}
	
}
