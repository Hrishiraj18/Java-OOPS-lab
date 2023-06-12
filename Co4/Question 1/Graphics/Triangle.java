package Graphics;
import java.util.*;

interface tri
{
	void area();
}
public class Triangle implements tri{
	Scanner scan=new Scanner(System.in);
	public void area()
	{
		System.out.println("Please enter the base and height of triangle");
		float base =scan.nextFloat();
		float height=scan.nextFloat();
		System.out.println("The area of the Rectangle is "+"  "+(.5*base*height));
	}
	
}
