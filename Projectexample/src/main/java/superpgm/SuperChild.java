package superpgm;

public class SuperChild extends Classparent
{
	String colour="Green";

	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args)
	{
		SuperChild ch=new SuperChild();
		ch.display();
	}

}
