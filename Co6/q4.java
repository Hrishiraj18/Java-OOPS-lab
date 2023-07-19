package co6;

import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class q4 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        FileInputStream source = new FileInputStream ("E:\\source.txt");
        FileOutputStream destination_odd = new FileOutputStream ("E:\\odd.txt");
        FileOutputStream destination_even = new FileOutputStream ("E:\\even.txt");

        int i;
        while((i = source.read()) != -1){
            if(i%2==0) {

                destination_even.write(i);
            }
            else {

                destination_odd.write(i);
            }
        }
        System.out.println("copied");
        source.close();
        destination_even.close();
        destination_odd.close();



    }

}