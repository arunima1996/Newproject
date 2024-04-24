package aggregationEx;

public class Author 
{
 String Author_Name;
 int age;
 
 Book book;
 
 public Author(String Author_Name,int age,Book book)
 {
	 this.Author_Name=Author_Name;
	 this.age=age;
	 
	 this.book=book;
 }
 
 public void Display()
 {
	 System.out.println("Book Name"+ book.Book_name +book.Number);
	 System.out.println(Author_Name+ age);
	 
 }

	public static void main(String[] args) 
	{
	
        Book b=new Book("Temple",10);
        
         Author obj=new Author("Arunima",20,b);
         obj.Display();
         
	}

}
