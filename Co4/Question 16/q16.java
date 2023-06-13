package co4;
import java.util.*;
public class q16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashSet<Integer> hs1=new HashSet<>();
		HashSet<Integer>hs2=new HashSet<>();
		System.out.println("Enter the number of elements\n");
		int s=scan.nextInt();
		for (int i=0;i<s;i++)
		{
			System.out.println("Enter the element no :"+" "+i+"for HashSet 1");
			int s1=scan.nextInt();
			hs1.add(s1);
			System.out.println("Enter the element no :"+" "+i+"for HashSet 2");
			int s2=scan.nextInt();
			hs2.add(s2);
		}
		for(Integer e:hs1)
		{
			if(hs2.contains(e))
			{
				System.out.println("TRUE");
			}
			else
				System.out.println("FALSE");
		}
	}

}
