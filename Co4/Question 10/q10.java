package co4;
import java.util.*;


public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		int choice;
		do
		{System.out.println("1.add\n2.clear\n3.contains\n4.get\n5.index\n6.remove\n7.size\n8.Empty or Not\n9.sort\n0.exit\nEnter your choice ----->");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the number of entries");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{	String s=scan.next();
			al.add(s);
		}
		System.out.println("The ArrayList is"+""+al);break;
		case 2:	System.out.println("The ArrayList before clearing is "+""+al);
			al.clear();
			System.out.println("The ArrayList after clearing is "+""+al);break;
		case 3:	System.out.println("Enter the string you want to check");
				String s1=scan.next();
				if(al.contains(s1))
					System.out.println(s1+""+"is present in the ArryaList");
				else
					System.out.println(s1+""+"is not present");break;
		case 4:	System.out.println("Enter the index of element");
				int s2=scan.nextInt();
				System.out.println("the elemenst at index "+""+s2+""+al.get(s2));break;
		case 5:System.out.println("Enter the element to retrieve index");
		String s3=scan.next();
		System.out.println("the index of element is "+""+al.indexOf(s3));break;
		case 7:System.out.println("The size of ArrayList is "+""+al.size());break;
		case 6:System.out.println("Enter the index ");
				int s4=scan.nextInt();
				System.out.println("The removed element is "+""+al.remove(s4));break;
		case 8:if(al.isEmpty())
			System.out.println("The ArrayList is Empty");
			else
			System.out.println("The ArrayList is not Empty");break;
		case 9:al.sort(Comparator.naturalOrder());
		System.out.println(al);
		
		
		}
		}while(choice!=0);
	}

}
