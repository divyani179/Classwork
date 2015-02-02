package PACK2;
interface inter{
	
	
	void m1();
}
interface myin{
	int x=10;
	void m1();
	void m2();
	
}
 class IA implements myin ,inter{

	public void m1(){
		System.out.println("java in a"+x);
	}
	public void m2(){
		System.out.println("Reports in A"+x);
	}
	String mymethod(){
		return "own method of IA";
	}
}
abstract class IB implements myin,inter{
	public void m1(){
		System.out.println("linux in B "+x);
		
	}
}
class IBsub extends IB implements inter{
	public void m2(){
		System.out.println("product from Bsub"+x);
		
	}
	void submeth(){
		System.out.println("in sub class");
		
	}
}
class Interclient{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
myin ref;
ref=new IA();
ref.m1();
ref.m2();

System.out.println(IA.x);
System.out.println(new IA().mymethod());
	ref=new IBsub();
	ref.m1();
	ref.m2();
	new IBsub().submeth();
	System.out.println(ref.x);
	System.out.println(new IBsub().x);
	System.out.println(myin.x);
	IB obj=new IBsub();
	System.out.println(obj.x);
	
	
	}

}
