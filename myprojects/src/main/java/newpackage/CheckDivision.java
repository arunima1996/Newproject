package newpackage;

public class CheckDivision extends Addresult
{
	int div;
	public void cdivision()
	{
		
	
		div=super.addResult();
		
		if(div%10==0)
		{
			System.out.println("Is divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}
	public static void main(String[] args)
	{
	
	CheckDivision obj=new CheckDivision();
	obj.cdivision();

	}

}
