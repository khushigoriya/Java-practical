/**
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to show how to create a file with different mode and methods of File class
to find path, directory etc.
 */
import java.io.*;
public class Pract5_1 {
    public static void main(String[] args) 
    {
        File f = new File("abc.txt");
        System.out.println("File name :" + f.getName()); 
        System.out.println("Path: " + f.getPath()); 
        System.out.println("Absolute path:" + f.getAbsolutePath()); 
        System.out.println("Parent:" + f.getParent()); 
        System.out.println("Exists:" + f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable: " + f.canWrite()); 
            System.out.println("Is readable: " + f.canRead()); 
            System.out.println("Is a directory: " + f.isDirectory()); 
            System.out.println("File Size in bytes: " + f.length()); 
        } 
   }
}
