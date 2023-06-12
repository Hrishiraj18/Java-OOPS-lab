package co4;
import java.util.*;

public class q13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s;
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		do {
		System.out.println("1.ENQUEUE\n2.DEQUEUQ\n3.TOP\nEnter your choice\n");
		s=scan.nextInt();
		switch(s)
		{
		case 1:System.out.println("Enter the number of elements");
				int n=scan.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the elements");
					int s1=scan.nextInt();
					pq.offer(s1);
				}System.out.println(pq);
				break;
		case 2:
			pq.poll();
			System.out.println(pq);break;
		case 3:
		System.out.println(pq.peek());
		break;
		}
		}while(s!=0);
	}

}
