package pack3;

abstract class Vehicle{
	int price;
	String name,model;
	Vehicle(String name,int price,String model){
		this.name=name;
		this.price=price;
		this.model=model;
	}
	void getDetails(){
		System.out.println("Name :"+name);
		System.out.println("price :"+price);
		System.out.println("model :"+model);
		
	}
	abstract void getMileage(String name);
	
}
interface insurance{
	void getInsurance();
}
interface accesories{
	void exAccess();
}
interface Fac extends accesories{
	void inAccess();
}
class Car extends Vehicle implements insurance,Fac{
	
	Car(String name, int price, String model) {
		super(name, price, model);
		// TODO Auto-generated constructor stub
	}
	public void exAccess()
	{
		System.out.println("get the access of external funcs");
	}
	public void inAccess()
	{
		System.out.println("INACCESS");
	}

	@Override
	public void getInsurance() {
		System.out.println("get insurance");
		// TODO Auto-generated method stub
		
	}
	@Override
	void getMileage(String name) {
		// TODO Auto-generated method stub
		
		
	}
	
}
class Bike extends Vehicle{

	Bike(String name, int price, String model) {
		super(name, price, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Car("div",34567,"audi");
		v.getDetails();
		v.getMileage("div");
		Car car=(Car)v;
		insurance in=car;
		in.getInsurance();
		Fac a=car;
		a.exAccess();
		a.inAccess();
		
		
       
	}

}
