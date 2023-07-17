package co6;

import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;


public class a3 {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub



        FileInputStream fileinput = new FileInputStream("E:\\source.txt");

        FileOutputStream fileoutput = new FileOutputStream("E:\\destination.txt");

        int i;
        while((i = fileinput.read()) != -1){
            fileoutput.write(i);
        }
        System.out.println("copied");
        fileinput.close();
        fileoutput.close();


    }
}