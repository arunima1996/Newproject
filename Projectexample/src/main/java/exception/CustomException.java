package exception;

public class CustomException 
{
	public static void main(String[] args) throws VottingException 
	
	{
		int age=12;
		if(age>=18)
		{
			System.out.println("Eligible for votting");
		}
		else
		{
			throw new VottingException("Not eligible for Votting");
		}
	}

}
