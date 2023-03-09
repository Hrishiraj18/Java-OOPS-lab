package course;
import java.util.Scanner;

class Complex
{
	int r3,c3;
	void add(int r1,int c1,int r2,int c2)
	{
		r3=r1+r2;
		c3=c1+c2;
		System.out.println("The complex number after addition is "+r3+"+i"+c3 );
	}
}

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the real part of number 1 :");
		int real1=scan.nextInt();
		System.out.println("Enter the Complex part of number 1 :");
		int complex1=scan.nextInt();
		System.out.println("Enter the real part of number 2 :");
		int real2=scan.nextInt();
		System.out.println("Enter the Complex part of number 2 :");
		int complex2=scan.nextInt();
		System.out.println("The first complex number is "+ real1+"+i"+complex1);
		System.out.println("The first complex number is "+ real2+"+i"+complex2);
		Complex complex=new Complex();
		complex.add(real1, complex1, real2, complex2);

}
}
