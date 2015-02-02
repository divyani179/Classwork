package pack;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String details=args[0];
Scanner sc = new Scanner(System.in);
System.out.println("enter name");
String name=sc.nextLine();
System.out.println("salary");
int salary=sc.nextInt();
System.out.println("city");
//sc.next();
String city=sc.nextLine();
sc.next();
System.out.println(name+""+salary+""+city);



	}

}
