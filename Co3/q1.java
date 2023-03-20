package co3;
import java.util.*;

class FIND_AREA
{	Scanner s=new Scanner(System.in);
	//method to find area of square
	int area(int length)
	{
		System.out.println("The area of square is ");
		return length*length;
	}
	//method to find area of rectangle\
	float area(float a,float b)
	{
		System.out.println("The area of rectangle is ");
		return a*b;
	}
	double area(double r)
	{
		System.out.println("The area of circle is ");
		return 3.141*r*r;
	}
	
}
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIND_AREA a=new FIND_AREA();
		int c;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("1.Square\n2.Rectangle\n3.Circle\n0.Exit\nEnter your choice\n---->");
			c=s.nextInt();
			switch(c)
			{
			//case 1
			case 1:System.out.println("Enter the side of square ");
			int side=s.nextInt();
			int area=a.area(side);
			System.out.println(area);
			break;
			//case 2
			case 2:System.out.println("Enter the sides of rectangle");
			float length=s.nextFloat();
			float breadth=s.nextFloat();
			float a1=a.area(length, breadth);
			System.out.println(a1);
			break;
			//case 3
			case 3:System.out.println("Enter the radius of circle");
			double r=s.nextDouble();
			double a11=a.area(r);
			System.out.println(a11);
			
			
			//case 0
			case 0:System.out.println("Terminating program");
			System.exit(0);
			break;
				
			
			//default
			default:System.out.println("Invalid choice");
			}
			
		}while(c!=0);
		s.close();
	
}
}
