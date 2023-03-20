package co3;
import java.util.*;

class Employee
{
	int Empid;
	String Name;
	int Salary;
	String Address;
	
	Employee(int Empid,String Name,int Salary,String Address)
	{
		this.Empid=Empid;
		this.Name=Name;
		this.Salary=Salary;
		this.Address=Address;
		
	}
}

class Teacher extends Employee
{
	String Department;
	String Subject;
	Teacher(int Empid,String Name,int Salary,String Address,String Department,String Subject)
	{
		super(Empid,Name,Salary,Address);
		this.Department=Department;
		this.Subject=Subject;
	}
	
	void display_data()
	{
		System.out.println("Employee id :"+" "+Empid);
		System.out.println("Name :"+" "+Name);
		System.out.println("Salary :"+" "+Salary);
		System.out.println("Address :"+" "+Address);
		System.out.println("Department :"+" "+Department);
		System.out.println("Subject :"+" "+Subject);


	}
	
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of teachers whose data is to be stored");
		int n=s.nextInt();
		Teacher th[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the employee id,name and salary of teacher "+" "+(i+1));
			int id=s.nextInt();
			String name=s.next();
			int sal=s.nextInt();
			System.out.println("Enter the address of teacher "+" "+(i+1));
			String add=s.next();
			System.out.println("Enter the Department and subject handled by the teacher "+" "+(i+1));
			String dep=s.next();
			String sub=s.next();
			th[i]=new Teacher(id,name,sal,add,dep,sub);
			
		}
		
		System.out.println("TEACHERS LIST");
		System.out.println("*****************************************************");
		for(int i=0;i<n;i++)
		{	System.out.println("Teacher no"+" "+(i+1));
			th[i].display_data();
			System.out.println();
		}
		s.close();
		
		

	}

}
