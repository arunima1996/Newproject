package accessmodifier1;

public class Accessclass 
{
	public void display1()
	{
		System.out.println("This is public");
	}
	private void dispaly2()
	{
		System.out.println("This is private");
	}
	protected void dispaly3()
	{
		System.out.println("This is protected");
	}
	void dispaly4()
	{
		System.out.println("This is default");
	}

	public static void main(String[] args)
	{
	Accessclass obj=new Accessclass();
	obj.display1();
	obj.dispaly2();
	obj.dispaly3();
	obj.dispaly4();

	}

}
