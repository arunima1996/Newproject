package superpgm;

public class ChildClass extends SuperParent
{

	public void display1()
	{
		
		System.out.println("Hello");
		super.display();
	}
	public static void main(String[] args)
	{
		ChildClass ch=new ChildClass();
		ch.display1();

	}

}
