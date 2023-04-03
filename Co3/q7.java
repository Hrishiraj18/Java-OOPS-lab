package co3;
import java.util.*;
import java.time.LocalDate; 

interface calculate
{
	void netamount();
	double total(int quantity,float price);
	
}
//creating a class for each item
class Item
{
	int prodid;
	String Name;
	int quantity;
	float unitprice;
	float total;
	Item(int prodid,String name,int quantity,float unitprice)
	{
		this.prodid=prodid;
		this.Name=name;
		this.quantity=quantity;
		this.unitprice=unitprice;
		this.total=(float)(total);
	}
}

//creating a class for orders

class Order implements calculate

{
	float total,net;
	int orderno;
	String date;
	Item items[];
	public double total(int quantity,float price)
	{
		return quantity*price;
	}
	Scanner s =new Scanner(System.in);
	Order()
	{
		this.orderno=s.nextInt();
		this.date=s.next();
		System.out.println("Enter the number of items");
		int n=s.nextInt();
		items=new Item[n];
		for(int i=0;i<items.length;i++)
		{
			System.out.println("Please enter the Product id ,name,quantity and unit price\n");
			int pid=s.nextInt();
			String name=s.next();
			int quantity=s.nextInt();
			float price=s.nextFloat();
			items[i]=new Item(pid,name,quantity,price);
		}
	}
	public void netamount()
	{	float net=0;
		for(int i=0;i<items.length;i++)
		{
			net+=items[i].total;
		}
	}
}


public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
