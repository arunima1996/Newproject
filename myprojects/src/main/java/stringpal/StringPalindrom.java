package stringpal;
import java.util.Scanner;

public class StringPalindrom 
{
    public void stringName()
    {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stringReverse(str);
        checkPalindrome(str);
    }
    
    public void stringReverse(String str)
    {
        StringBuilder obj=new StringBuilder(str);
        String reversedString = obj.reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }

    public void checkPalindrome(String str)
    {
        StringBuilder obj=new StringBuilder(str);
        String reversedString = obj.reverse().toString();
        if(str.equals(reversedString))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args)
    {
        StringPalindrom stringPalindrom = new StringPalindrom();
        stringPalindrom.stringName();
    }
}
