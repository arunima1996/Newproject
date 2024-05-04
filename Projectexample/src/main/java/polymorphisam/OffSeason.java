package polymorphisam;

public class OffSeason extends OnSeason


{
	int amount1=25000;
	float dis1;
	
	public void discount()
	{
		dis1=amount1*25/100;
		System.out.println("Customer is Purchased on Off Season and having a discount of 25%");
		System.out.println("AMOUNT: "+ dis1);
		super.discount();
	}

	public static void main(String[] args) 
	{
		
		OffSeason obj=new OffSeason();
		
		obj.discount();
	}

}
