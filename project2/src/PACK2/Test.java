package PACK2;
class Emp{
	int sal;
	String name;
	Emp(){
		System.out.println("default constructor of Employee");
	}
	void getDetails(){
		System.out.println("name :"+name+" " +sal);
	}
}
class Mgr extends Emp{
	int bonus;
	Mgr()
	{
		System.out.println("default constructor of manager");
	}
	void cal(){
		System.out.println("salary is :"+sal+bonus);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Emp e=new Emp();
 e.name="div";
 e.sal=2000;
 e.getDetails();
 Mgr m=new Mgr();
m.name="div";
m.sal=2999;
 m.getDetails();
m.bonus=56;
 m.cal();
	}

}
