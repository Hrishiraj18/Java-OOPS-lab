package co4;
import java.util.*;
import Graphics.Circle;
import Graphics.Rectangle;
import Graphics.Triangle;
import Graphics.Square;
public class q1 {

	public static void main(String[] args) {
		int choice;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("1.Square\n2.Rectangle\n3.Triangle\n4.Circle\n0.Exit\nEnter your choice------>");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:Square obj1=new Square();
				obj1.area();break;
			case 2:Rectangle obj2=new Rectangle();
				obj2.area();break;
			case 3:Triangle obj3=new Triangle();
				obj3.area();break;
			case 4:Circle obj4=new Circle();
				obj4.area();break;
		}
			}while(choice!=0);
		}
	}

