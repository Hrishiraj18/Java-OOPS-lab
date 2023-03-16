package co2;
import java.util.*;
class String_func
{
	Scanner scan=new Scanner(System.in);
	void replace()
	{
		System.out.println("Enter the string ");
		String str=scan.nextLine();
		System.out.println("Entered String is "+str);
		System.out.println("Enter the word to be replaced");
		String replaced=scan.nextLine();
		System.out.println("Enter the word to  replace");
		String replace=scan.nextLine();
		System.out.println("The manipulated string is :"+str.replace(replaced,replace));	
	}
	void concatenation()
	{
		System.out.println("Enter the string 1 ");
		String str1=scan.nextLine();
		System.out.println("Enter the string 2 ");
		String str2=scan.nextLine();
		str1=str1.concat(str2);
		System.out.println("The concatenated string is: "+str1);
	}
	
	void uppercase()
	{
		System.out.println("Enter the string");
		String str=scan.nextLine();
		System.out.println("The upper case conversion is "+str.toUpperCase());
	}
	void lowercase()
	{
		System.out.println("Enter the string");
		String str=scan.nextLine();
		System.out.println("The lower case conversion is "+str.toLowerCase());
	}
	void length()
	{
		System.out.println("Enter the string");
		String str=scan.nextLine();
		System.out.println("The length of the string is : "+str.length());
		
	}
	void substring()
	{
		System.out.println("Enter the string");
		String str=scan.nextLine();
		System.out.println("Enter the first  index");
		int index1=scan.nextInt();
		System.out.println("Enter the second index");
		int index2=scan.nextInt();
		System.out.println("The substring is "+str.substring(index1, index2));
	
	}
	void split()
	{
		System.out.println("Enter the string");
		String str=scan.nextLine();
		String array[]=str.split("");
		System.out.println("The string after splitiing is "+Arrays.toString(array));
		
	}
}

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan=new Scanner(System.in);
		String_func fun=new String_func();
		do
		{System.out.println("1.Replace\n2.Concatenation\n3.Uppercase\n4.Lowercase\n5.Length\n6.Substring\n7.Split\n0.Exit\nEnter the choice");
		number=scan.nextInt();	
		switch(number)
		{
		case 1:fun.replace();
				break;
		case 2:fun.concatenation();
				break;
		case 3:fun.uppercase();
				break;
		case 4:fun.lowercase();
				break;
		case 5:fun.length();
				break;
		case 6:fun.substring();
				break;
		case 7:fun.split();
				break;
		case 0:System.out.println(" ***************************************************** Exiting *****************************************************");
				break;
		default:System.out.println("Invalid choice");
		
		}
		}
		while(number!=0);
		
	}

}
