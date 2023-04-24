package co4;
import java.util.*;

class Authenticator
{
	void validator(String username,String password)
	{
		if(!Objects.equals(username,"batman")||!Objects.equals(password, "brucewayne"))
		{
			try
		{
				throw new Exception();
		}
		catch (Exception e)
		{
			System.out.println("The provided username or password is incorrect");
		}
	}
		else
			System.out.println("Login successfully\n");
			
}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your user name and password");
		String us_name=scan.nextLine();
		String us_pass=scan.nextLine();
		Authenticator a1=new Authenticator();
		a1.validator(us_name, us_pass);
	}

}
