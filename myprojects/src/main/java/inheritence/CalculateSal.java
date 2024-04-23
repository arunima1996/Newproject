package inheritence;

public class CalculateSal extends EmployeeSal
{
	float hra;
	float pf;
	
	public void calculateSal()
	{
		System.out.println("hra is:-");
		hra= (base_sal*5)/100;
		
		System.out.println(hra);
		
		System.out.println("Pf is:-");
		 pf= (base_sal*20)/100;
		 
		 System.out.println(pf);
		
		
	}

}
