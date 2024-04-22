package inheritence;

public class Multiclass3 extends Multiclass1
{
	
	public void display3()
	{
		System.out.println("Print inheritence concept");
	}

	public static void main(String[] args) 
	{
		
Multiclass3 obj=new Multiclass3();
obj.display1();
obj.display2();

obj.display3();

	}

}
