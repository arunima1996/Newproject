package inheritence;
import java.util.Scanner;

public class EmployeeSal
{
	int base_sal;
	int deduction;
	int bonus;
	
	public void getSal()
	{
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Basic salary");
	
	base_sal=sc.nextInt();
	
	System.out.println("Enter Deduction amount");
	
	deduction=sc.nextInt();
	
	System.out.println("Enter Bonus");
	
	bonus=sc.nextInt();
			
	
	
	}

}
