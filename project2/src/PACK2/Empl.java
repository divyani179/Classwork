package PACK2;
class A
{ String name;
int age;
	A()
	{
	System.out.println("class A");
	}
public A(String name,int age)
{
	super();
	this.name = name;
	this.age=age;
	System.out.println("name"+" "+name+" "+"age"+" " + age);
}
}

class B extends A
{ 
	B()
	{
	System.out.println("class b");
	}

	public B(String name, int age)
	{
		super(name, age);
		System.out.println("name"+" "+name+" "+"age"+" " + age);
		// TODO Auto-generated constructor stub
	}
	
	
}
public class Empl{
	String name;
	int age;
	Empl()
	{
		System.out.println("name"+name+""+"age" + age);
		name="ram";
		age=24;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A("ram",45);
		B b=new B();

	}

}
