package interfaceEx;

public class InterfaceExamp implements InterfaceExample,Interface2
{

	public static void main(String[] args) 
	{
		InterfaceExamp obj=new InterfaceExamp();
		obj.display();
		obj.display1();

	}

	@Override
	public void display() 
	{
		System.out.println("Interface");
		
	}



	@Override
	public void display1() 
	{
		System.out.println("Multiple inheritence example");
		
	}

}
