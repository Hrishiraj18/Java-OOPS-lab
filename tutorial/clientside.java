package tutorial;
import java.io.*;
import java.net.*;

public class clientside {
	public static void main(String[]args)
	{
		try
		{
			Socket s=new Socket("<ip address here",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello welcome optimus");
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
