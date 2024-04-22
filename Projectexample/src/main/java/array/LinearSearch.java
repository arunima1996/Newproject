package array;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
		{
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int key = sc.nextInt();

        int index = -1; // Initialize index to -1

        // Perform linear search
        for (int i = 0; i < size; i++) 
		{
            if (array[i] == key)
			{
                index = i; // Set index to the found index
                break; // Exit loop once element is found
            }
        }

        if (index != -1)
			{
            System.out.println("Element found at index: " + index);
        } 
		else
		{
            System.out.println("Element not found in the array.");
        }
    }
}

