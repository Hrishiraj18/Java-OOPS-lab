package Graphics;
import java.util.*;

interface sq
{
	void area();
}

public class Square {
	Scanner scan=new Scanner(System.in);
	public void area()
	{
		System.out.println("Please enter the side of the square");
		float side=scan.nextFloat();
		System.out.println("The area of the square is "+" "+side*side);
	}
}
