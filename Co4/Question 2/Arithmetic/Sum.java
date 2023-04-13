package Arithmetic;
import java.util.*;

interface add
{
	void sum();
}
public class Sum implements add{

	public  void sum() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("The sum of two numbers are"+" "+(num1+num2));	
	}

}
