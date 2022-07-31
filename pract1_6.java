
//NAME: KHUSHI GORIYA 
// ID: 21CE035import java.util.*;
//Given an array of strings, return a new array without the strings that are equal to the target string.
// One approach is to count the occurrences of the target string, make a new array of the correct length, 
//and then copy over the correct strings.
import java.util.*;
public class pract1_6 {
    public static void  wordsWithout(String[] a,String b)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(b))
            {
                count++;
            }
        }
        int l=a.length-count;
        System.out.println("NEW ARRAY:");
        for(int i=0;i<a.length;i++)
        {
                if(a[i].compareTo(b)!=0)
                {
                   System.out.println(a[i]);
                
                }
        }
       
        
    }
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter length:");
    int n=s.nextInt();
    System.out.println("Enter elements:");
    String s1[]=new String[n];
    for(int i=0;i<(n);i++)
    {
        s1[i]=s.next();
    }
    System.out.println("Enter string :");
    String s2=s.next();
    wordsWithout(s1,s2);
    s.close();
    }
}
