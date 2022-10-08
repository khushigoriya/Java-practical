/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to transfer data from one file to another file so that if the destination file does not exist, it is created. 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Pract5_3 
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("p3.txt");
        f1.createNewFile();
        FileInputStream input = new FileInputStream("p3.txt");
        FileOutputStream output = new FileOutputStream("copy.txt");
        
        int temp;
        while((temp = input.read()) != -1) 
        {
            output.write((char) temp);
        }
        output.close();
        input.close();
    }    
}

