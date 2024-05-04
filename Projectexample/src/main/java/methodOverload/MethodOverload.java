package methodOverload;

public class MethodOverload extends MethodOverrideEx
{

	public void methodOver()
	
	{
		
		System.out.println("Welcome");
		super.methodOver();
	}
	public static void main(String[] args) 
	{
		MethodOverload obj=new MethodOverload();
		obj.methodOver();
				

	}

}
