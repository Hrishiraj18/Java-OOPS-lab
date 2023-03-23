package co3;
import java.util.*;

class Publisher
{
	String publisher;
	String location;
 Publisher(String publisher,String location)
 {
	 this.publisher=publisher;
	 this.location=location;
 }
}

class Book extends Publisher
{
	String title;
	int page;
	Book(String publisher,String location,String title,int page)
	{
		super(publisher,location);
		this.title=title;
		this.page=page;
		
	}
	
}
//Fiction 
class Fiction extends Book
{
	String fiction_type;
	Fiction(String publisher, String location, String title, int page,String fiction_type) {
		super(publisher, location, title, page);
		this.fiction_type=fiction_type;
	}
	void display()
	{	
		System.out.println("***************************************");
		System.out.println("Publisher :"+publisher);
		System.out.println("Location :"+location);
		System.out.println("title :"+title);
		System.out.println("page:"+page);
		System.out.println("Fiction Type:"+fiction_type);
		System.out.println("***************************************");

	}
	
}

class Literature extends Book
{
	String lit_type;
	Literature(String publisher, String location, String title, int page,String lit_type) {
		super(publisher, location, title, page);
		this.lit_type=lit_type;
	}
	void display()
	{	
		System.out.println("***************************************");
		System.out.println("Publisher :"+publisher);
		System.out.println("Location :"+location);
		System.out.println("title :"+title);
		System.out.println("page:"+page);
		System.out.println("Fiction Type:"+lit_type);
		System.out.println("***************************************");

	}
	
}


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Fiction\n2.Literature\n0.Exit\nEnter Your choice\n--------->");
			choice=s.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Publisher :");
				String publisher=s1.nextLine();
				System.out.println("Location :");
				String location=s1.nextLine();
				System.out.println("title :");
				String title=s1.nextLine();
				System.out.println("page:");
				int page=s.nextInt();
				System.out.println("Fiction Type:");
				String fiction=s1.nextLine();
				Fiction book=new Fiction(publisher,location,title,page,fiction);
				book.display();
				
				
				break;
			
			case 2:
				System.out.println("Publisher :");
				String publisher1=s1.next();
				System.out.println("Location :");
				String location1=s1.next();
				System.out.println("title :");
				String title1=s1.next();
				System.out.println("page:");
				int page1=s.nextInt();
				System.out.println("Fiction Type:");
				String literature=s.next();
				Fiction book1=new Fiction(publisher1,location1,title1,page1,literature);
				book1.display();
				break;
				
				
			default:System.out.println("Invalid choice");
					break;
					
			
			
			}
			
		}
		while(choice!=0);
	}

}
