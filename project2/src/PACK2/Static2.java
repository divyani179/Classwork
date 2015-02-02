package PACK2;
import static PACK2.Test2.getmess;
 class Test2{
	 static int x,y=90;
	 static{
		System.out.println("static block of test class"); 
	 }
	 static void getmess()
	 {
		 System.out.println("hiiiiii");
	 }
 }
public class Static2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("in main");
     getmess();
     
	}

}
