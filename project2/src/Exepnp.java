import java.util.Scanner;

class User{
	String[] name={"div","shiv","rajat","rishab","richa"};
	void checkn(String nam) throws NamenotfoundException , Exception{
		
		try {
			for(String na:name)
			{
				if(nam.equalsIgnoreCase(na))
				{
					System.out.println(("name is :"+nam));
					break;
				}
				else
				{
					throw new NamenotfoundException("sorry! your name has not found");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("caught exception in name()"+" "+e);
			throw e;
			
		}
		finally{
			System.out.println("close");
		}
	}
	void checkp(String pass) throws ToolongpassException, TooshortpassException, Exception{
		try {
			if(pass.length()<3)
			{
				throw new TooshortpassException("your password is too short!");
				
			}
			else if(pass.length()>12){
				throw new ToolongpassException("your password is too long!");
			}
			else
			{
				System.out.println("logging in..please wait!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
	System.out.println("caught exception in pass()"+e);
	throw e;
		}
		finally{
			System.out.println("close2");
			
		}
	}
}
public class Exepnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in main");
 Scanner s=new Scanner(System.in);
      String name=s.next();
    
      User u=new User();
      u.checkn(name);
      String pass=s.next();
      u.checkp(pass);
      System.out.println("values entered!");
      System.out.println("login successfully!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
       System.out.println("completed!");
       
	}

}
