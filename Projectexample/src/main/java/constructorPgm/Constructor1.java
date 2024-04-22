package constructorPgm;

	public class Constructor1
	{

	   public Constructor1(int a, int b)
		{
	       int sum = a + b;
	       System.out.println("Sum: " + sum);
	   }

	   public static void main(String[] args) 
		{
	       
	       Constructor1 cn = new Constructor1(10, 20);
	   }
	}


