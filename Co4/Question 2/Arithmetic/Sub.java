package Arithmetic;
import java.util.*;

interface subtraction
{
	void sub();
}
public class Sub implements subtraction {

	public void sub() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1>num2)
		System.out.println("The difference of two numbers are"+" "+(num1-num2));
		if(num2>num1)
		System.out.println("The difference of two numbers are"+" "+(num2-num1));
}
}