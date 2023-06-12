package Arithmetic;
import java.util.*;

interface mult
{
	void product();
}

public class Mul implements mult {
	public void product()
	{ Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two numbers");
		float n1=scan.nextFloat();
		float n2=scan.nextFloat();
		System.out.println("The product of two numbers is "+"  "+n1*n2);
	}

}
