/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * WAP to generate user defined exception using “throw” and “throws” keyword.
 */
public class Pract4_2 {
    public static void fun() throws NullPointerException
    {
        throw new NullPointerException("MY MSG!");
    } 
    public static void main(String[] args) {
        try{
            fun(); 
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("END!!");
    }
}
