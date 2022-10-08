/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to enter any 15 numbers from the user and store only even numbers in a file named “Even.txt”. And display the contents of this file on the console.
(BufferedReader / BufferedWriter). 
 */
import java.io.*;
import java.util.*;

public class Pract5_5 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter writer = new FileWriter("Even.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 15 whole numbers: ");
        int[] num = new int[15];
       for(int i=0;i<15;i++)
        {
            num[i] = in.nextInt();
        }
        for(int i=0;i<15;i++) 
        {
            if(num[i]%2 == 0) 
            {
                buffer.write(num[i]);
            }
        }
        
        buffer.close();

        System.out.println("Content in the file is: ");
        FileReader reader = new FileReader("Even.txt");
        BufferedReader read = new BufferedReader(reader);

        int i;
        while((i=read.read()) != -1)
        {
            System.out.println(i);
        }

    }
}
