package loops;
import java.util.Scanner;

public class Switchstatement
{
public static void main(String[] args)
{
	System.out.println("Enter a character");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);


switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':

System.out.println("The " +ch + " " + "is a vowel");
break;

default:
System.out.println("The "+ch + "is not a vowel");

}
//System.out.println("The "+ch + "is not a vowel");
}
}