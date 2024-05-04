package collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) 
	{
		List <String> obj=new ArrayList<String>();
		obj.add("Arunima");
		obj.add("Raj");
		obj.add("Anu");
		obj.add("Arunima");
		obj.set(1, "Anju");
		int a=obj.indexOf("Arunima"); 
		System.out.println(a);
		int b=obj.lastIndexOf("Arunima");
		System.out.println(b);
		obj.remove(3);
		boolean o=obj.contains("Anu");
		System.out.println(o);
		System.out.println(obj.get(2));
		System.out.println(obj);

	}

}
