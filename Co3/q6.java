package co3;
import java.util.*;


interface Prototype
{
	void area();
	void perimeter();
}

class Circle implements Prototype
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void perimeter()
	{
		System.out.println("The circumference  of the circle is "+(2*Math.PI*radius));
	}
	public void area()
	{
		System.out.println("The area of circle is"+""+(Math.PI*Math.pow(radius, 2)));
	}
}


class Rectangle implements Prototype
{
	float length,breadth;
	Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void area()
	{
		System.out.println("The area of Rectangle is "+" "+length*breadth);
	}
	
	public void perimeter()
	{
		System.out.println("The perimeter of Rectangle is "+" "+(2*(length+breadth)));
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n1.Circle\n2.Rectangle\n0.Exit\nEnter your choice\n--------->");
			choice=s.nextInt();	
			switch(choice)
			{
			
			case 1:System.out.println("Enter the radius of the circle");
				double radius=s.nextDouble();
				Circle circle=new Circle(radius);
				circle.area();
				circle.perimeter();
				break;
			case 2:System.out.println("Enter the length and breadth of the Rectantgle");
				float length=s.nextFloat();
				float breadth=s.nextFloat();
				Rectangle rec= new Rectangle(length,breadth);
				rec.area();
				rec.perimeter();
				break;
			case 0:System.out.println("The system is exiting\n");
					System.exit(0);
					break;
			default:System.out.println("Invalid choice !!! Please enter a valid choice\n");
			}
		}while(choice!=0);
		s.close();

	}

}
