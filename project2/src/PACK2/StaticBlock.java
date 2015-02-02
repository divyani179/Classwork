package PACK2;

public class StaticBlock {

	static int x,y=70;
	
	static{
		System.out.println(x+" "+y);
		System.out.println("static1 block is getting executed");
		x=89;
		y=90;
		System.out.println(x+" "+y);
	}
	static{
		System.out.println(x+" "+y);
		System.out.println("static2 block is getting executed");
		x=9;
		y=96;
		System.out.println(x+" "+y);
	}
	static void getn()
	{
		System.out.println("method is getting executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("in main");
  getn();
  System.out.println(x+" "+y);
	}

}
