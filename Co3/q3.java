package co3;
import java.util.*;
//class person

class Person
{
	String name;
	String gender;
	String address;
	int age;
	Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
	
}

//class employee

class Employees extends Person
{
	int empid;
	int salary;
	String qualification;
	String company;
	Employees(String name,String gender,String address,int age,int empid,int salary,String qualification,String company)
	{
		super(name,gender,address,age);
		this.qualification=qualification;
		this.company=company;
	}
}
//class teacher


class Teachers extends Employees
{
	String department;
	String subject;
	int tid;
	Teachers(String name,String gender,String address,int age,int empid,int salary,String qualification,String company,String department,String subject,int tid)
	{
		super(name,gender,address,age,empid,salary,qualification,company);
		this.department=department;
		this.subject=subject;
		this.tid=tid;
	}
	
	void display_data()
	{	
		
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Address :"+address);
		System.out.println("Age :"+age);
		System.out.println("Employee id :"+" "+empid);
		System.out.println("Salary :"+" "+salary);
		System.out.println("Qualification:"+" "+qualification);
		System.out.println("Company:"+" "+company);
		System.out.println("Department :"+" "+department);
		System.out.println("Subject :"+" "+subject);
		System.out.println("Teacher id :"+tid);

	}
		
}

class Encaps
{
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	Teachers t[];
	
	void enter()
	{
		System.out.println("Enter the no of entries");
		int n=s.nextInt();
		t= new Teachers[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("*******************************************");
			System.out.println();
			System.out.println("Teacher no :"+" "+(i+1));
			System.out.println("Enter the name ");
			String name=s.next();
			System.out.println("Enter the gender ");
			String gender=s.next();
			System.out.println("Enter the adress");
			String address=s.next();
			System.out.println("Enter the age");
			int age=s.nextInt();
			System.out.println("Enter the employee_id");
			int empid=s.nextInt();
			System.out.println("Enter the salary");
			int salary =s.nextInt();
			System.out.println("Enter the Qualification ");
			String qualification=s.next();
			System.out.println("Enter the company");
			String company=s.next();
			System.out.println("Enter the department");
			String department=s.next();
			System.out.println("Enter the subject");
			String subject=s.next();
			System.out.println("Enter the teacher id ");
			int  tid=s.nextInt();
			t[i]= new Teachers(name,gender,address,age,empid,salary,qualification,company,department,subject,tid);
			
		}
	}
	void print_details()
	{
		for(int i=0;i<t.length;i++)
		{
			t[i].display_data();
			System.out.println("*******************************************");
		}
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaps x=new Encaps();
		x.enter();
		x.print_details();

	}

}
