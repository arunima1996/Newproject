package exception;


public class ExceptionNullpointer 
{

	public static void main(String[] args)
	{
	try
	{
	int a=10;
	int b=0;
    int c=a/b;
    System.out.println(c);
	
	}
	catch(ArithmeticException obj)
	{
		int b=29;
		System.out.println(b);
	}
	
finally
{
	System.out.println("Code must print");
}
}
}