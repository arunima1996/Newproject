package methods;

	import java.util.Scanner;

	public class Studentgrade
	 {

	    String name;
	    int mark1;
	    int mark2;
	    int mark3;
	    int total;
	    char grade;

	    public void  Studentgrade(String Name, int m1, int m2, int m3, int tot)
		{
	        name = Name;
	        mark1 = m1;
	        mark2 = m2;
	        mark3 = m3;
	        total = m1 + m2 + m3;
	    }

	    public int Displaymark() 
		{
	        return total;
	    }

	    public char Grade()
		{
	        float percentage = total / 3; 

	        if (percentage >= 80) 
			{
	            grade = 'A';
	        } 
			else if (percentage >= 70)
			{
	            grade = 'B';
	        }

			else if (percentage >= 60) 
			{
	            grade = 'C';
	        } 
			else if (percentage >= 50) 
			{
	            grade = 'D';
	        } 
			else 
			{
	            grade = 'F';
	        }

	        return grade;
	    }

	    public static void main(String[] args) 
		{
	        Scanner sc = new Scanner(System.in);

	        Studentgrade obj1 = new Studentgrade(); // object created for first student
	        Studentgrade obj2 = new Studentgrade(); //  for second student

	        System.out.println("Enter details for First Student");
	        System.out.println("Enter name:");
	        String name1 = sc.nextLine();

	        System.out.println("Enter first mark:");
	        int mark11 = sc.nextInt();
	        System.out.println("Enter second mark:");
	        int mark12 = sc.nextInt();
	        System.out.println("Enter third mark:");
	        int mark13 = sc.nextInt();

	        obj1.Studentgrade(name1, mark11, mark12, mark13, 0);

	        sc.nextLine(); // Consume newline

	        System.out.println("Enter details for Second Student");
	        System.out.println("Enter name:");
	        String name2 = sc.nextLine();

	        System.out.println("Enter first mark:");
	        int mark21 = sc.nextInt();
	        System.out.println("Enter second mark:");
	        int mark22 = sc.nextInt();
	        System.out.println("Enter third mark:");
	        int mark23 = sc.nextInt();

	        obj2.Studentgrade(name2, mark21, mark22, mark23, 0);

	        System.out.println("Details for First Student:");
	        System.out.println("Name: " + obj1.name);
	        System.out.println("Total marks: " + obj1.Displaymark());
	        System.out.println("Grade: " + obj1.Grade());

	        System.out.println("Details for Second Student:");
	        System.out.println("Name: " + obj2.name);
	        System.out.println("Total marks: " + obj2.Displaymark());
	        System.out.println("Grade: " + obj2.Grade());
	    }
	}



