package PACK2;
class A1{
	{
		System.out.println("jsdvg");
	}
	A1(){
		System.out.println("constructor A");
	}
	static{
		System.out.println("static block of A class");
	}
}
public class InitDemo extends A1{
 int x,y;
 InitDemo(int x,int y){
	 this.x=x;
	 this.y=y;
	 System.out.println(x+"  "+y);
 }
	static{
		System.out.println("static1");
	}
	static{
		System.out.println("static2");
	}
	{
		System.out.println("init block1");
	}
	{
		System.out.println("initblock 2 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InitDemo i=new InitDemo(12, 14);
InitDemo i1=new InitDemo(34, 90);
	}

}
