package co3;
import java.util.*;

interface shop
{
	void calculate();
}

class Product
{
	int prodid;
	String name;
	int quantity;
	float price;
	float total;
	Product(int prodid,String name,int quantity,float price,float total)
	{
		this.prodid=prodid;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		this.total=total;
	}
	
}

class Order implements shop
{
	Date date;
	int orderno;
	Product item[];
	int n;
	float net;
	
	Scanner s=new Scanner(System.in);
	Order(int orderno,int n)
	{
		this.orderno=orderno;
		this.n=n;
		date=new Date();
		item=new Product[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the product id,name,quantity,price of the item"+""+(i+1));
			int pid=s.nextInt();
			String pname=s.next();
			int pq=s.nextInt();
			float qpr=s.nextFloat();
			float ptotal=pq*qpr;
			item[i]=new Product(pid,pname,pq,qpr,ptotal);
		}
	}
	public void calculate()
	{	float net=0;
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Order No :"+""+this.orderno);
		System.out.println();
		System.out.printf("Date : %tD%n\n\n",this.date);
		System.out.println("Product Id\tName\t\tQuantity\tPrice\t\tTotal\n");
		System.out.println("______________________________________________________________________________________________________");
		for(int i=0;i<item.length;i++)
		{
			net+=item[i].total;
		System.out.println(item[i].prodid+"\t\t"+item[i].name+"\t\t"+item[i].quantity+"\t\t"+item[i].price+"\t\t"+item[i].total+"\n");
		
	    }
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\tNET AMOUNT ="+""+net);
    }
	
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of items in the order");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int orderno=(int)(Math.random()*1000);
		Order x= new Order(orderno,n);
		x.calculate();	
		s.close();
	}

}
