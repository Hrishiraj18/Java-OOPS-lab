package Graphics;
import java.util.*;

interface rect
{
	void area();
}

public class Rectangle implements rect{
	Scanner s= new Scanner(System.in);
	public void area()
	{
		System.out.println("Please enter the length and breadth of the Rectangle");
		float length=s.nextFloat();
		float breadth=s.nextFloat();
		System.out.println("The Area of the Rectangle is"+" "+length*breadth);
	}
}
