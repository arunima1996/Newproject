package excelRead;

import java.io.IOException;

public class ExcelRead1
{
	public static void main(String[] args) throws IOException
	{
		String y=ExcelReadExample.getStringData(1, 0);
		System.out.println(y);
		
		String z=ExcelReadExample.getIntegerData(1, 1);
		System.out.println(z);
		
	}

}
