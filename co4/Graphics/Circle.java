package Graphics;
import java.util.Scanner;

interface circle1
{
	void area();
}
public class Circle implements circle1{
	Scanner s= new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter the radius of the circle");
		float radius=s.nextFloat();
		System.out.println("The radius of the circle is "+(Math.PI*Math.pow(radius,2)));
	}
}
