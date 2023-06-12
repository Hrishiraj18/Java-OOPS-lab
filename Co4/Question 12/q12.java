package co4;
import java.util.*;
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);			s.push(40);	s.push(50);		s.push(60);		s.push(70);		s.push(80);
		System.out.println("The element before removing from stack"+s);
		System.out.println("Enter the index to remove");
		int x=scan.nextInt();
		s.remove(x);
		System.out.println("The element after removing from stack"+s);
		
		

	}

}
