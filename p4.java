package course;
import java.util.Scanner;

class Matrix
{
	int m2[][]=new int[3][3];
	void transpose(int m[][])
	{
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				m2[i][j]=m[j][i];
			}
		}
	}
	
	void transpose_matrix(int m[][])
	{
		int val=0;
		for(int i=0;i<m2.length;i++)
		{
			for(int j=0;j<m2.length;j++)
			{
				if(m2[i][j]==m[i][j])
				{
					val=1;
				}
				else
				{
					val=0;
					break;
				}
			}
			if(val==0)
			{
				break;
			}
		}
		 if(val==1){
	            System.out.println("The matrix is symmetric");
	        }
	        if(val==0){
	            System.out.println("The matrix is not symmetric");
	        }
		
	}
}

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][]=new int[3][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the matrix ");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix entered is ");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		Matrix x=new Matrix();
		x.transpose(m);
		x.transpose_matrix(m);
	}

}
