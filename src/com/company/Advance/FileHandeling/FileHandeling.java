package com.company.Advance.FileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling {

    public static void main(String[] args) {

        // Creating a new file
/*
        File myfile = new File("FileHandeling.text");

        try {
            myfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
      /*  // Writing a file
        try {
            FileWriter write = new FileWriter("FileHandeling.text");
             write.write("This session is for file handeling");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Reading File
        File myfile = new File("FileHandeling.text");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        File myfile = new File("FileHandeling.text");
        if(myfile.delete()){
            System.out.println("I have deleted: " + myfile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
    }


// What is file handeling?
//File handling in Java is defined as reading, writing and delete data to a file
// for example in Filehandeling .java class we can read, write and delete the file.
