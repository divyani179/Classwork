package PACK2;


	
	public class Emp1{
		String name;
		int sal;
		int id;


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Emp1 e=new Emp1("div",4567,45);
	      e.getdetails();
		}
	void getdetails()
	{
		System.out.println(name);
		System.out.println(sal);
		System.out.println(id);
	}

	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp1(String name,int sal,int id)
	{
		this(name,sal);
		this.id=id;
		System.out.println("id initialized");
		getdetails();
		

		
	}
	public Emp1(String name,int sal)
	{
		this(name);
		this.sal=sal;
		
		System.out.println("salary initialized");
		getdetails();
	
		
	}
	public Emp1(String name)
	{
		this.name=name;
		System.out.println("name initialized");
		getdetails();
	}
	}

