

 class Userbank{
int bal=4000;
void withdraw(int x) throws NBException,ODException,Exception{
	int v=bal-x;
	try{
		if(v==0){
			throw new NBException("Negative Balance!!!!");
		}
		else if(x>500)
		{
			throw new ODException("OD Not allowed");
		}
		else{
			bal=bal-x;
			System.out.println("balance is"+bal);
		}
	}catch(Exception e){
		System.out.println("caught exception"+" "+e);
		throw e;
	}
	finally{
		System.out.println("close");
	}
	System.out.println("in main");
}
}
public class Client{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	System.out.println("in atm");
	int val=Integer.parseInt(args[0]);
	System.out.println("value given");
	Userbank ex=new Userbank();
	ex.withdraw(val);
	System.out.println("amount withdrawn successfully!");
	
}catch(Exception e){
	System.out.println(e);
}
System.out.println("completed");
	}

}
