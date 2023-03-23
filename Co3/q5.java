package co3;
import java.util.*;

class Student
{
	int rollno;
	String name;
	String level;
	int marks;
	Student(int rollno,String name,String level,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.level=level;
		this.marks=marks;
	}
	
}
class Sport extends Student
{
	String sports;
	Sport(int rollno,String name,String level,int marks,String sports)
	{
		super(rollno,name,level,marks);
		this.sports=sports;
	}
}

class Result extends Sport
{
	String result_ac;
	String result_sp;
	Result(int rollno,String name,String level,int marks,String sports,String result_ac,String result_sp)
	{
		super(rollno,name,level,marks,sports);
		this.result_ac=result_ac;
		this.result_sp=result_sp;
	}
	void result()
	{
		System.out.println("Roll no :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Level :"+level);
		System.out.println("Marks :"+marks);
		System.out.println("Sports:"+sports);
		System.out.println("Academic Result :"+result_ac);
		System.out.println("Sports Result :"+result_sp);

		
	}
}

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Roll no");
		int roll=s.nextInt();
		System.out.println("Name :");
		String name=s.next();
		System.out.println("Level :");
		String level=s.next();
		System.out.println("Marks :");
		int marks=s.nextInt();
		System.out.println("Sports:");
		String sports=s.next();
		System.out.println("Academic Result");
		String r1=s.next();
		System.out.println("Sports Result :");
		String r2=s.next();
		Result x=new Result(roll,name,level,marks,sports,r1,r2);
		x.result();
		
	}

}
