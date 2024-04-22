package inheritence;

public class Inheritence3 extends Inheritence2

{
	public void display3()
	{
		System.out.println("Hellow World");
	}

	public static void main(String[] args) 
	{
		
		Inheritence3 obj1=new Inheritence3();
		
		obj1.display3();
		obj1.display1();
	}
}
