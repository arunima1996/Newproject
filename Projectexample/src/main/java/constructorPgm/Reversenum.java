package constructorPgm;

public class Reversenum
{
	    int digit = 0;
	    int rev = 0;

	    public Reversenum(int num)
		{
	       
	        int temp = num;

	        while (temp != 0)
				{
	            digit = temp % 10;
	            rev = rev * 10 + digit;
	            temp /= 10;
	        }
	        System.out.println("Reversed Num: " + rev);
	    }

	 

	    public static void main(String[] args) {
	        // Invoke the constructor with an argument
	        Reversenum obj = new Reversenum(123);
	    }
	}


