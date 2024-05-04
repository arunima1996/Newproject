package abstractionExample;

public class AbstractionEx1 extends AbstractionEx
{
	

	public static void main(String[] args)
	{  
		AbstractionEx1 obj=new AbstractionEx1();
		obj.display1();
		obj.display();

	}

	@Override
	public void display() 
	{
		System.out.println("Override method");
		
	}

}
