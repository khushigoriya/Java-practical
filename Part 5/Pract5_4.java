/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * WAP to show use of character and byte stream 
 */
import java.io.*;

public class Pract5_4 {
    public static void main(String[] args) throws IOException {
    
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("p4.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((char)temp);
            }       
        }
        finally
        {       
                if (sourceStream != null)       
                {
                    sourceStream.close();
                }                      
        }
    }
}



