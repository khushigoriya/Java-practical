/**
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * WAP to show the try - catch block to catch the different types of exception.
 */
public class Pract4_1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c[]={1,2,3};
        try{
            if(a>0)
            {
                System.out.println("a/b="+a/b);
            }
            else{
                System.out.println("c[4]="+c[4]);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("EXCEPTION: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("EXCEPTION: "+e);
        }
        System.out.println("END!!");
    }
}