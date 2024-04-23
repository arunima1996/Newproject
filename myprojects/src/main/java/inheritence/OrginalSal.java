package inheritence;

public class OrginalSal extends CalculateSal
{
	
	float total;
	
	public void totalSal()
	{
		System.out.println("Total Sal:- ");               
		total=base_sal+hra+pf+deduction+bonus;
		System.out.println(total + "\n");
		
	}
	
	public void getSalslip()
	{
		System.out.println("\033[1mSALARY SLIP:\033[0m "+ "\n");
		System.out.print("BASE SALARY :" + " " +base_sal +"\n"
				+ "Deduction :" + " " + deduction + "\n"+ "HRA :" +hra + "\n"
				+"PF :"+" " +pf + "\n" + 
				"Bonus :"+bonus+"\n");
	System.out.println("Total Salary: " + " "+total);
	}

	public static void main(String[] args) 
	
	{
		OrginalSal obj=new OrginalSal();
				obj.getSal();
				obj.calculateSal();
				obj.totalSal();
				obj.getSalslip();
		
		

	}

}
