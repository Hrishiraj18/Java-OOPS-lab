package Arithmetic;
import java.util.*;

interface Division
{
	void div();
}

public class Div implements Division {
	public void div()
	{ Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two numbers");
		float n1=scan.nextFloat();
		float n2=scan.nextFloat();
		if(n1>n2)
		System.out.println("the division of 2 numbers is "+ " "+n1/n2);
		if(n2>n1)
		System.out.println("the division of 2 numbers is "+" "+ n2/n1);

	}

}
