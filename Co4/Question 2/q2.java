package co4;
import java.util.*;
import Arithmetic.Sum;
import Arithmetic.Sub;
import Arithmetic.Mul;
import Arithmetic.Div;
public class q2 {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{	
			System.out.println("1.Sum\n2.Subtraction\n3.Multiplication\n4.Division\n0.Exit\n----->");
			choice=s.nextInt();
			switch(choice)
			{
			case 1: Sum s1=new Sum();
					s1.sum();
					break;
			case 2: Sub s2=new Sub();
					s2.sub();
					break;
			case 3: Mul s3=new Mul();
					s3.product();
					break;
			case 4: Div s4= new Div();
					s4.div();
					break;
			case 0:System.exit(0);
					break;
			}
			
		}while(choice!=0);
		s.close();
	}

}
