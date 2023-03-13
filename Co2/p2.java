package co2;
import java.util.Scanner;
class Array{
	void search(int a[],int size,int value)
	{
		int flag=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(value==a[i])
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			count++;
		}
		if(flag==0)
		{
			System.out.println("The element is not present in array");
		}
		if(flag==1)
		{
			System.out.println("The"+value+" is present in array on position"+count);
		}
		
	}
}

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of elements to be inserted in a string");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The entered array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		Array array=new Array();
		System.out.println("Enter the value to be searched");
		int val=scan.nextInt();
		array.search(arr, n, val);
	}

}
