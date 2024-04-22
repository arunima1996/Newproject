package array;


import java.util.Scanner;
public class Arraylist
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int[] array1=new int[3]; //INITIALIZATION


 System.out.println("Enter the first number" + " ");
 array1[0]=sc.nextInt();

 System.out.println("Enter the Second number" + " ");
 array1[1]=sc.nextInt();
 
 System.out.println("Enter the Third number" + " ");
 array1[2]=sc.nextInt();
 
 
  

System.out.println("Array of numbers:");
for(int i=0;i<array1.length;i++)  // array1.length - to get the length of the array1
{

System.out.print(array1[i] + " ");  
}
}
}

