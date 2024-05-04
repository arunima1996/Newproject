package superkeyword;

public class ChildSupermethod extends ParentSupermethod
{
	public void childSuper()
	{
		super.parentsuper();
		System.out.println("All vehicles are movable");
		 
	
	
	}
	
	public static void main(String[] args)
	{
		ChildSupermethod obj1=new ChildSupermethod();
		obj1.childSuper();
		
	}
}
