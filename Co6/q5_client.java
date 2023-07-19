package co6;

import java.io.*;
import java.net.*;

public class q5_client {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",9999);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("Client Call!!!");
            dout.flush();
            dout.close();
            socket.close();
        }catch(Exception e){System.out.println(e);}
    }
}