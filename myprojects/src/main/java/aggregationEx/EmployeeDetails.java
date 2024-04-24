package aggregationEx;

public class EmployeeDetails 
{
	int emp_id;
	String Name;
	EmployessAddress Address;
	
	public EmployeeDetails(int emp_id,String Name,EmployessAddress Address)
	{
		this.emp_id=emp_id;
		this.Name=Name;
		this.Address=Address;
	}
	
	public void Display()
	{
		System.out.println("ID  :"+emp_id + "\n"+"Name:"+Name);
		System.out.println("Country  :"+Address.CountryName+ " \n"+ "City  :"+ Address.city + "\n"+ "State  :"+Address.state);
	}

	public static void main(String[] args) 
	
	{
		
		EmployessAddress emp=new EmployessAddress("India","Vaikom","Kottayam");
		EmployessAddress emp1=new EmployessAddress("UAE","Ajman","Dubai");
	
		EmployeeDetails obj=new EmployeeDetails(1,"Aunima",emp);
		EmployeeDetails obj1=new EmployeeDetails(2,"Athira",emp1);
		
		obj.Display();
		obj1.Display();
		

	}

}
