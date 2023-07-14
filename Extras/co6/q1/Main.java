package com.lab_cycles.co6.q1;
import java.io.*;
public class Main {

public static void main(String[] args) {


        File file = new File("../../../");


        String[] fileList = file.list();

        for(String str : fileList) {
            System.out.println(str);
        }

        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.startsWith("A");
            }
        };
        System.out.println("\n");
        String[] children = file.list(filter);
        if (children == null) {

            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

}
