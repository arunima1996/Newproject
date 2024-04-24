package newpackage;
import java.util.Scanner;

public class Addresult 
{
	
	int num1;
	int num2;
	int sum;
	
	public int addResult()
	{
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number1 :");
        
        num1=sc.nextInt();
        
        System.out.println("Enter Number2 :");
        
        num2=sc.nextInt();
        
        System.out.println("Sum :");
        
        
		sum=num1+num2;
		
		System.out.println(sum);
		
        return sum;
	}


}
