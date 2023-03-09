package course;
import java.util.Scanner;

class product{
	int pcode;
	String pname;
	int price;
}
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		product obj1= new product();
		product obj2= new product();
		product obj3= new product();
		
		
		System.out.println("Enter the product code for the first object :");
		obj1.pcode=sc.nextInt();
		System.out.println("Enter the name  for the first object :");
		obj1.pname=sc.next();
		System.out.println("Enter the product price for first object :");
		obj1.price=sc.nextInt();
		
		System.out.println("Enter the product code for the second object :");
		obj2.pcode=sc.nextInt();
		System.out.println("Enter the name  for the second object :");
		obj2.pname=sc.next();
		System.out.println("Enter the product price for second object :");
		obj2.price=sc.nextInt();
		
		
		System.out.println("Enter the product code for the third object :");
		obj3.pcode=sc.nextInt();
		System.out.println("Enter the name  for the third object :");
		obj3.pname=sc.next();
		System.out.println("Enter the product price for third object :");
		obj3.price=sc.nextInt();
		
		if(obj1.price<obj2.price && obj1.price<obj3.price)
		{
			System.out.println("Product name :" +obj1.pname +" " +"Product code : "+ obj1.pcode +" " +"Price :" +obj1.price +" " +"has the lowest value");
		}
		else if(obj2.price<obj1.price && obj2.price<obj3.price)
		{
			System.out.println("Product name " +obj2.pname +" " +"Product code : "+ obj2.pcode +" " +"Price :" +obj2.price +" " +"has the lowest value");
		}
		else
		{
			System.out.println("Product name " +obj3.pname +" " +"Product code : "+ obj3.pcode +" " +"Price :" +obj3.price +" " +"has the lowest value");
		}

	}

}
