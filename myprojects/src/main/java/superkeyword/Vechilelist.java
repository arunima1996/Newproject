package superkeyword;

public class Vechilelist extends Vehicle

{
	 
	int vnum=12345;
	public void vechiclenum()
	{
		
	
	System.out.println(super.vnum); // accessing parent class object from child class using super key word
	System.out.println(vnum); // child class object
	
	}

    public static void main(String[] args)
    {
        Vechilelist obj = new Vechilelist();
        obj.vechiclenum();
    }
}


