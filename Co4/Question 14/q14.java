package co4;
import java.util.*;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayDeque<Integer> q=new ArrayDeque<>();
		int choice;
		do
		{
			System.out.println("1.offerfirst\n2.offerlast\n3.offer\n4.peekfirst\n5.peeklast\n6.peek\n7.pollfirst\n8.poll _last\n9.poll\n0.exit\nEnter your choice---> ");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter item");
				int s1=scan.nextInt();
				q.offerFirst(s1);
				System.out.println("After operation "+" "+q);
				break;
			case 2:
				System.out.println("Enter item");
				int s2=scan.nextInt();
				q.offerLast(s2);
				System.out.println("After operation "+" "+q);
				break;
			case 3:
				System.out.println("Enter item");
				int s3=scan.nextInt();
				q.offer(s3);
				System.out.println("After operation "+" "+q);
				break;
			case 4:
				System.out.println("The head of queue at front is "+" "+q.peekFirst());break;
			case 5:
				System.out.println("The head of queue at last is "+" "+q.peekLast());break;
			case 6:
				System.out.println("The head of queue is "+" "+q.peek());break;
			case 7:
				System.out.println("The element polled out from front end is  "+q.pollFirst());
				System.out.println("The queue after operation is "+""+q);break;
			case 8:
				System.out.println("The element polled out from back end is  "+q.pollLast());
				System.out.println("The queue after operation is "+""+q);break;
			case 9:
				System.out.println("The element polled out is  "+q.poll());
				System.out.println("The queue after operation is "+""+q);break;
				
			}
		}while(choice!=0);
	}

}
