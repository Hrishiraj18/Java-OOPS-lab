package co2;
import java.util.*;

class Sort{
	void sort(String a[])
	{
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

//after sorting
class After{
	void sort(String a[])
	{	System.out.println("before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
//main

public class p111 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of string");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the string");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		After after=new After();
		Sort sort=new Sort();
		after.sort(a);
		sort.sort(a);
	}

}
