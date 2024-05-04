package superkeyword;

public class ChildSupermethod2 extends ParentSupermethod

{
	public void Superchild()
	{
		super.parentsuper();
		
		System.out.println("Call parent class");
	}

	
	public static void main(String[] args) 
	{
		ChildSupermethod2 obj=new ChildSupermethod2();
		
		obj.Superchild();
		
		
		
	}

}
