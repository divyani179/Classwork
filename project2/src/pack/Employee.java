package pack;

import java.util.Scanner;
class emp{
	String name;
	int sal;
	void getDetails()
	{
		System.out.println(name+" "+sal);
	}
String mess(String msg)
{ 
	return "welcome"+msg;
	
}
}

public class Employee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp e1 =new emp();
emp e2 =new emp();
Scanner s=new Scanner(System.in);
System.out.println("enter values for employee name and salary ");

e1.name=s.next();

e1.sal=s.nextInt();
e1.getDetails();
System.out.println(e1.mess("sdhf"));
System.out.println("enter values for second employee name and salary ");
e2.name=s.next();
e2.sal=s.nextInt();
e2.getDetails();
System.out.println(e2.mess("yo"));
//System.out.println(e1.name+" "+e1.sal+" "+e2.name+" "+e2.sal);
	}

}
