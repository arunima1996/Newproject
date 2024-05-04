package atm;

//import java.util.Scanner;
  
public class User 
{
    public static void main(String[] args) 
    
    {
       //Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        
        System.out.println("Enter your PIN:");
        
       //int pin = sc.nextInt();
        
        obj.setPin();
        obj.getPin();
        
        //obj.validatePin();
        
    }
}


