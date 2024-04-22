package constructorPgm;

public class ConsThis
{
	
	int result;
	public ConsThis(int a, int b)
	{
	this();
	result=a+b;
	System.out.println("Result:"+result);

	}
	 public ConsThis()
	 {
	 
	 System.out.println("Hello world");
	 }
	 public static void main(String[] args)
	 {
	 ConsThis cn=new ConsThis(2,3);
	 
	 }
	 }
	 

