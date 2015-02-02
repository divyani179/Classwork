package pack;
class Shape{
	void Area(int a)
	{
		System.out.println("square"+a*a);
	}
	void Area(int a,int b)
	{
		System.out.println("rectangle"+a*b);
	}
	void Area(double r)
	{
		System.out.println("circle"+(3.14*r*r));
	}
}
public class Overload{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.Area(10);
		s.Area(10,20);
		s.Area(2.1);
		
		

	}

}
