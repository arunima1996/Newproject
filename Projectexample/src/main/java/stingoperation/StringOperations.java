package stingoperation;

public class StringOperations {

	public static void main(String[] args)
	
	{
String name="Arunima";
		
		char n=name.charAt(2); //to get a particular character from index position
		System.out.println(n);
		
		String a="Manu";
		System.out.println(name.compareTo(a)); 
		System.out.println(name.length());  
		String s= "SARI";
		System.out.println(s.toUpperCase());
		
		String b= "sARI";
		System.out.println(b.toLowerCase());
		
		String c="How are you";
		//String s="are";
		System.out.println(c.contains("are"));
		
		name=name.concat("Raj");
		System.out.println(name);
		System.out.println(b.equals(s));
		System.out.println(b.equalsIgnoreCase(s));
		

	}

}
