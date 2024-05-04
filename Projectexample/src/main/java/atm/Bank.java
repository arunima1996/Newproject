package atm;
import java.util.Scanner;

public class Bank
{
    private int[] validpin = {1001, 1234, 1212}; // given valid pins
    private int pin; 
    

    public void setPin() 
    {
    	Scanner sc=new Scanner(System.in);
      
        pin=sc.nextInt();//value of local variable is assigned to instance variable
        
    }
    
    
    public void getPin()    //method for return pin
    {
    	
        System.out.println("Entered Pin is : " +pin);
        this.validatePin();
    } 


    
    public void validatePin() // method for validate pin
    {
    	
    	for (int i = 0; i < validpin.length; i++) 
    	{
            int validpins = validpin[i];
            
            if (this.pin == validpins)
            {
               System.out.println("Succesfully entered PIN");
               return;
            }
        }
        System.out.println("Invalid PIN number");
    }
}
   



