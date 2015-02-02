package pack;
class Student{
	String name;
	int sal;
	/*String CheckGrade(int m1,int m2,int m3)
	{ String grade;
	 float avg;
	 avg=(m1+m2+m3)/3;
	 if(avg==10)
     System.out.println("grade S");
	 else if(8<=avg)
	 {
	 System.out.println("grade A");
	 }
	 else if(avg<8)
	 {
		 System.out.println("grade B");
	 }
	 return "grade";
	}*/
	/*Student(String name1,int sal1){
		name=name1;
		sal=sal1;
	}*/
	Student(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	void Get()
	{
		System.out.println(name+""+sal);
	}
}
public class StuTest {

	public StuTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1=new Student("div",24);
 s1.Get();
 //s1.CheckGrade(10, 10, 10);
 Student s2=new Student("shiv",56);
 //s2.CheckGrade(8,8,8);
 s2.Get();
 
	}

}
