package constructorPgm;

public class ConstructorInstance 
{
	String name;
	int mark;
	 
	public ConstructorInstance(String Name,int Mark)
	{
	name=Name;
	mark=Mark;
	}
	public String StudentName()
	{
	return name;
	}
	public int mark()
	{
	return mark;
	}
	public static void main(String[] args)
	{

	ConstructorInstance cn=new ConstructorInstance("Arunima",100);

	System.out.println("Student name:"+ " " +cn.StudentName());
	System.out.println("Student mark:"+ " " +cn.mark());
	}
	}


