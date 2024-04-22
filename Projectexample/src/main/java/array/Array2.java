package array;


import java.util.Scanner;
public class Array2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); // Create an object for scanner class

System.out.println("Enter the size of the array"); //ask user for size of the array
int size=sc.nextInt(); // get size of array from user 

int array1[]= new int[size]; //Decalare array

System.out.println("Enter " + size + "Elements" ); //Ask user to print elements


for(int i=0;i<array1.length;i++) // for loop for printing elements will check the length of the array and can enter number upto length
{
array1[i]=sc.nextInt(); // if size=4 i=3
}

System.out.print("Elements entered:"); 
for(int i=0;i<array1.length;i++) // loop for print array elements 
{
	System.out.print(array1[i] + " "); //to print array elements
}
}
}

  