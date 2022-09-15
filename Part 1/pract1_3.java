//NAME: KHUSHI GORIYA 
// ID: 21CE035
// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %10 is 7.


import java.util.*;
public class pract1_3 {
    static void lastDigit(int x,int y)
    {
        if(x%10==y%10)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    int a,b;
    a=s.nextInt();
    b=s.nextInt();
    lastDigit(a,b);
    s.close();
    }          
}
