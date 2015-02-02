package PACK2;
class Animal
{
	void sound()
	{
		System.out.println("no sound");
	}
}
class Cat extends Dog{
	void sound()
	{
		System.out.println("MEOW MEOW");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("bhow bhow");
	}
}
public class Ccdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Animal s;
  
  s=new Cat();
  s.sound();
  Dog d=(Dog)s;
  d.sound();
	}

}
