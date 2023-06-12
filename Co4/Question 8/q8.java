package co4;
import java.io.*;
import java.util.*;
//implementation using ArrayList
class stack<T> {
	ArrayList<T> A;
	int top = -1;
	int size;
	stack(int size)
	{
		this.size = size;
		this.A = new ArrayList<T>(size);
	}
	//push
	void push(T X)
	{
		if (top + 1 == size) {
			System.out.println("***Stack Overflow***");
		}
		else {
			top = top + 1;
			if (A.size() > top)
				A.set(top, X);

			else
				A.add(X);
		}
	}
	T top()
	{
		if (top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else
			return A.get(top);
	}
	void pop()
	{
		if (top == -1) {
			System.out.println("Stack Underflow");
		}

		else
			top--;
	}
	boolean empty() { return top == -1; }

	public String toString()
	{

		String Ans = "";

		for (int i = 0; i < top; i++) {
			Ans += String.valueOf(A.get(i)) + "->";
		}

		Ans += String.valueOf(A.get(top));

		return Ans;
	}
}

public class q8 {


	public static void main(String[] args)
	{
		int choice;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("0.Exit\n1Integer\n2.Character");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			int n;
			System.out.println("Enter the number of choices to enter\n");
			n=s.nextInt();
			stack<Integer> x1=new stack<>(n);
			while(n>0)
			{	int temp;
				System.out.println("Enter the value");
				temp=s.nextInt();
				n--;
				x1.push(temp);
			}
			System.out.println("The entities after pushing \n"+x1);
			System.out.println("The top element is "+" "+x1.top());
			x1.pop();
			System.out.println("Condition 1 after popping :\n" + x1);
			break;
		case 2:
			System.out.println("Enter the number of choices to enter\n");
			n=s.nextInt();
			stack<String> x2=new stack<>(n);
			while(n>0)
			{	String temp;
				System.out.println("Enter the value");
				temp=s.next();
				n--;
				x2.push(temp);
			}
			System.out.println("The entities after pushing \n"+x2);
			System.out.println("The top element is "+" "+x2.top());
			x2.pop();
			System.out.println("Condition 2 after popping :\n" + x2);
			break;
		default:System.out.println("Invalid choice");
		}
		}
		while(choice!=0);

}
}
