/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give example.
 */
import java.io.*;

public class Pract5_2 {
    public static void main(String[] args) throws IOException {
        // FileReader sourceStream = null;
        // try
        // {
        //     sourceStream = new FileReader("p2.txt");
        //     int temp;
        //     while ((temp = sourceStream.read()) != -1)
        //     {
        //         System.out.println((char)temp);
        //     }
        // }
        // finally
        // {           
        //         if (sourceStream != null)   
        //         {
        //             sourceStream.close();
        //         }                         
        // }
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new FileInputStream("p2.txt");
            targetStream = new FileOutputStream ("p2.1.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((byte)temp);
                targetStream.write((byte)temp);
            }         
        }
        finally
        {
            if (sourceStream != null)
            {
                sourceStream.close();   
            }
                        
            if (targetStream != null)   
            {
                targetStream.close();           
            }       
        }   
    }
}


