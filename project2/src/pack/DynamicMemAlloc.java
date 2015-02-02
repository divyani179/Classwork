package pack;

public class DynamicMemAlloc {
  int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DynamicMemAlloc d= new DynamicMemAlloc();
d.x=10;
d.y=20;
System.out.println(d.x+""+d.y);

DynamicMemAlloc d1=new DynamicMemAlloc();
d1.x=100;
d1.y=200;
System.out.println(d1.x+""+d1.y);

DynamicMemAlloc d2=d1;
d2.y=500;
d1=null;
System.out.println(d1.x+""+d1.y);
System.out.println(d2.x+""+d2.y);


	}

}
