package pack;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs v=new Varargs();
		v.Details("div");
		v.Details("soumya",20);
		v.Details("shivani",38,78);
		v.Details("rajat",65,67,45);

	}
 void Details(String name,int...b){
	System.out.println("welcome"+name);
	int sum=0;
	for(int v:b)
	{
		sum=sum+v;
		
	}
	System.out.println("SUM"+sum);
 }
 void Details(String name)
 {
	 System.out.println("welcome "+name);
 }
}

