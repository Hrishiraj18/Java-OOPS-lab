package co4;
import java.util.*;

public class q15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashSet<Integer>hs=new HashSet<>();
		int choice;
		do
		{System.out.println("1.adding elements\n2.clearing\n3.size\n4.Empty or not\n5.Contains\n0.Exit\n.Enter your choice --->");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter your element\n");
			int s=scan.nextInt();
			hs.add(s);
			System.out.println("SET->"+hs);break;
		case 2:
			hs.clear();
			System.out.println("The set is cleared\n");break;
		case 3:
			System.out.println("The size of the set is "+""+hs.size());break;
		case 4:if(hs.isEmpty())
			System.out.println("The set is empty\n");
		else
			System.out.println("The set is not empty\n");break;
		case 5:
			System.out.println("Enter the elements to check\n");
			int s1=scan.nextInt();
			if(hs.contains(s1))
				System.out.println("The set contains"+" "+s1);
			else
				System.out.println("The set does not contain"+""+s1);break;
		default:System.out.println("Invalid choice \n");
			
		}
		}while(choice!=0);

	}

}
