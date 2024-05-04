package exception;

public class ExceptionEx 
{
	public static void main(String[] args) 
	{
		
try
{
	
	int a=10;
	int b=0;
	
	int c=a/b;


	//System.out.println("Hello");
	System.out.println(c);
}
catch(ArithmeticException obj)
{
	int x=10;
	int y=5;
	int z=x/y;
	System.out.println(z +" " +obj);
	
}
finally
{
	System.out.println("Successfully completed");
}

    }
}