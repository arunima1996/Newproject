package abstractInterface;

public class Abstract implements AbstractInterfaceEx 
{

	@Override
	public void display() 
	{
	System.out.println("100 % Absttraction using interface");
		
	}
  
           public static void main(String[] args) 
           {
	
        	   Abstract obj=new Abstract();
        	   obj.display();
           }
           }
