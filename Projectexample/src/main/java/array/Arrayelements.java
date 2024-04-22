package array;

import java.util.Scanner;
public class Arrayelements
{

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter first matrix");


System.out.println("Enter row count fo fist matrix");
int row=sc.nextInt();
System.out.println("Enter column count of first matrix");
int col=sc.nextInt();

System.out.println("Enter first matrix elements");

int[][] array1=new int[row][col];

for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
    array1[i][j]=sc.nextInt();
//System.out.println(array[i]);
    }
}

System.out.println("Enter second matrix elements");

int[][] array2=new int[row][col];

for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
    array2[i][j]=sc.nextInt();
//System.out.println(array[i]);
    }
}


System.out.println("First Matris is");

for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
System.out.println(array1[i][j]);
}
System.out.println("");
}

System.out.println("Second Matris is");

for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
System.out.println(array2[i][j]);
}
System.out.println("");
}

System.out.println("Sum is");
int[][] sum = new int[row][col];

for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
	sum[i][j]=(array1[i][j]+array2[i][j]);
    System.out.println(sum[i][j]);
}
}
}
}

