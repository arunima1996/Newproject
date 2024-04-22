package stringmutable;

public class StringbuilderEx {

	public static void main(String[] args) 
	{

		 StringBuilder obj = new StringBuilder("Hello");
	        obj.insert(5, "World");
	        System.out.println(obj);
	        
	        obj.delete(1, 4);
	        System.out.println(obj); 
	        
	        obj.replace(1, 3, "he"); // replaces the characters from index 1 to index 3
	        System.out.println(obj); 
	        
	        obj.append("Hello");
	        System.out.println(obj);
	}

}
