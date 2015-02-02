package PACK2;

import java.util.Scanner;

/*class Shape as super class
area(int x, int y) as method 
class  Triangle, Rectangle as subclasses.
	override area(int x, int y)
class OverrideTest
PSVM - 
Get user input to check which shape area  has to be calculated.
call the methods using  DMD super class ref  =  sub class object*/

class Shape{
	
	int x,y;
	public Shape(int x,int y) {
		
		this.x=x;
		this.y=y;
		// TODO Auto-generated constructor stub
	}

	double area(){
		return x*y;
		
	}
}
class Triangle extends Shape{
	int x,y;
	
	public Triangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return ((0.5)*x*y);
	}

	
}
class Rectangle extends Shape{
	int x,y;
	

	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}


	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area();
	}
	

	
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter the shape for which u wanna cal the area");
      Shape t=new Triangle(4, 5);
      Shape r=new Rectangle(6, 5);
      
      Scanner s=new Scanner(System.in);
      String choice=s.next();
      if((choice.equalsIgnoreCase("triangle")))
      {
    	  System.out.println(t.area());
      }
      else
      {
    	  System.out.println(r.area());
      }
	}

}
