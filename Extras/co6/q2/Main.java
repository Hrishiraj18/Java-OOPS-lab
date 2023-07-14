package com.lab_cycles.co6.q2;

import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("java_write.txt",true);
            writer.write("new file is created");
            writer.close();
            FileReader reader = new FileReader("java_write.txt");
            BufferedReader br= new BufferedReader(reader);
            String line;
            System.out.println("Data read from the file");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("-----Error-----");
        }

    }

}