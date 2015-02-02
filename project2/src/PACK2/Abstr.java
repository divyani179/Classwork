package PACK2;
abstract class Bank{
	void admin(){
		System.out.println("admin method");
	}
	abstract void CL();
	abstract void HL();
	abstract void VL();
	
}
class Branch1 extends Bank{

	@Override
	void CL() {
		// TODO Auto-generated method stub
		System.out.println("branch1 CL");
	}

	@Override
	void HL() {
		// TODO Auto-generated method stub
		System.out.println("branch1 HL");
	}

	@Override
	void VL() {
		// TODO Auto-generated method stub
		System.out.println("branch1 VL");
	}
	
	void branchdet()
	{
		System.out.println("branch details fun");
	}
}
abstract class Branch2 extends Bank{

	@Override
	void CL() {
		// TODO Auto-generated method stub
		System.out.println("branch2 CL");
	}

	@Override
	void VL() {
		// TODO Auto-generated method stub
		System.out.println("branch2 VL");
	}
	void branchpay()
	{
		System.out.println("branch pay");
	}
}
 class Subbranch extends Branch2{

	@Override
	void HL() {
		// TODO Auto-generated method stub
		System.out.println("subbranch HL");
	}
	void subgreet(){
		System.out.println("hello");
	}
}
public class Abstr {

	public static void main(String[] args) {
		Bank ref=new Branch1();
	ref.CL();
	ref.VL();
	ref.HL();
	ref.admin();
		Branch1 b=(Branch1)ref;
		b.branchdet();

      Bank ref1=new Subbranch();
     Branch2 b2=(Branch2) ref1;
     b2.branchpay();
    Subbranch s=new Subbranch();
    s.HL();
    s.subgreet();
      
		// TODO Auto-generated method stub

	}

}
