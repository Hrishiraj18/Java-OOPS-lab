package course;
import java.util.Scanner;

class Addition
{
	int m3[][]=new int [2][2];
	void add(int m1[][],int m2[][])
	{
		System.out.println("The matrix after addition is ");
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1.length;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
	
	void print_matrix()
	{
		for(int i=0;i<m3.length;i++)
		{
			for(int j=0;j<m3.length;j++)
			{
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1[][]=new int[2][2];
		int m2[][]=new int[2][2];
		System.out.println("Enter the elements of first matrix ");
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1.length;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix ");
		for(int i=0;i<m2.length;i++)
		{
			for(int j=0;j<m2.length;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		
		Addition result=new Addition();
		result.add(m1,m2);
		result.print_matrix();
	}

}
