//NAME: KHUSHI GORIYA 
// ID: 21CE035
//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"yields "oz".


import java.util.*;
public class pract1_2 {
    public  static void startOZ(String x)
    {
        if(x.charAt(0)=='o' && x.charAt(1)=='z')
        {
           System.out.println("oz");
        }
        else if(x.charAt(0)=='o')
        {
            System.out.println("o");
        }
        else if(x.charAt(1)=='z')
        {
            System.out.println("z");
        }
       
    }
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    String s1;
    s1=s.nextLine();
    startOZ(s1);
    s.close();
    }   
}
