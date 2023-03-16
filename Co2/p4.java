package co2;
import java.util.*;

class Employee
{
	int eNo;
	String eName;
	int eSalary;
	
	Employee(int eNo,String eName,int eSalary)
	{
		this.eNo=eNo;
		this.eName=eName;
		this.eSalary=eSalary;
	}
}

public class p4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of employee information to store");
		int n=scan.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee no"+" "+(i+1)+" "+"details for employee number,name,salary");
			int no=scan.nextInt();
			String name=scan.next();
			int salary=scan.nextInt();
			emp[i]= new Employee(no,name,salary);
			
		}
		System.out.println();
		System.out.println("Enter the employee number to search");
		int number=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(emp[i].eNo==number)
			{
				flag=true;
				System.out.println("The employee is present in"+(i+1));
				System.out.println("************************");
				System.out.println("The employee number is "+emp[i].eNo);
				System.out.println("The employee name is "+emp[i].eName);
				System.out.println("The employee salary is "+emp[i].eSalary);
				break;
				
			}
			else
			{
				System.out.println("The employee is absent");
				
			}
		}
	}

}
