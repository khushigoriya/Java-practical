import java.io.*;

public class Pract5_4_1
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new FileInputStream("p4.1.txt");
            targetStream = new FileOutputStream ("copy1.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
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


