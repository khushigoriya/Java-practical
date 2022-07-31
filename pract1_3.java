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
