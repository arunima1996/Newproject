package methods;

public class StaticMethod 
{

	static int sum;
	public static void getName(int num1,int num2)
	
	{
		
		sum = num1+num2;
		
	}
	
	public static void printName()
	{
		System.out.println("Sum is "+sum);
	}

	public static void main(String[] args) 
	{
		StaticMethod.getName(2,4);
		StaticMethod.printName();

	}




}
