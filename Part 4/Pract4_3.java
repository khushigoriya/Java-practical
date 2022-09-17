/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
exceptions. Each ‘catch’ block handles a different type of exception. For example the
exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.
Display a message in the ‘finally’ block.

 */
import java.util.Scanner;

public class Pract4_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c[]={1,2,3,4};
        System.out.println("enter index number: ");
        int d=s.nextInt();
        try{
            System.out.println("a/b="+a/b);
            System.out.println("c[4]="+c[d]);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("EXCEPTION: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("EXCEPTION: "+e);
        }
        finally{
        System.out.println("END!!");
        }
        s.close();
    }
}

