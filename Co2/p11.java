package co2;
import java.util.*;

public class p11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of string to input");
		int n=scan.nextInt();
		String s1[]=new String[n]; 
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			s1[i]=scan.next();
		}
		String s2[]=new String[n];
		System.arraycopy(s1, 0, s2, 0, n);
		System.out.println("The string before sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(s1[i]+"\t");
		}
		System.out.println();
		Arrays.sort(s2);
		System.out.println("The string after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(s2[i]+"\t");
		}
		System.out.println();
	}
		
	}


