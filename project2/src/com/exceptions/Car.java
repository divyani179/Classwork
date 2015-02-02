package com.exceptions;

public class Car {
String name;
int price;


	public Car(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Car c1=new Car("div",3748);
		Car c2=new Car("divyani",92194);
		//System.out.println(c); gives hash code
		System.out.println(c1);
		System.out.println(c2);
	}

}
