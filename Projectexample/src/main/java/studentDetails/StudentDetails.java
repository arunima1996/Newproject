package studentDetails;

public class StudentDetails
{
	String student_name;
	int Roll_num;
	Address address;
	
	public StudentDetails(String student_name,int Roll_num,Address address)
	{
		this.student_name=student_name;
		this.Roll_num=Roll_num;
		this.address=address;
		
	}  
	
	public void Display()
	{
		System.out.println("Student Name: "+student_name + "\n" + "Roll Num: "+Roll_num);
		
		System.out.println("House Name :"+ address.house_name + " \n"+"Post Office :"+address.post_office+"\n"
		+"District :"+address.district+"\n"+"Zip Code :"+address.zip_code+"\n"+"Country :"+address.Country);
	}
	
	public static void main(String[] args)
	
	{
		Address obj=new Address("Heaven","Edavattom","Kottayam",686605,"India");
		
		StudentDetails obj1=new StudentDetails("Akash",10,obj);
		
		obj1.Display();
		
	}

}
