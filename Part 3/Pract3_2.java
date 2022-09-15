import java.util.Vector;
/*
  * NAME : KHUSHI GORIYA
    ID: 21CE035
    Write a program to create a default method in an interface IPrinter. 
    Create an interface IPrinter and IScanner. You can assume variables 
    and methods for both interfaces. Create a concrete class to implement
    both the interfaces. Create 5 objects of the class, store it in Vector
    and display the result of the vector.
  */
interface IPrinter{
     default void func()
     {
        System.out.println("In default func");
     }    
}
interface IScanner{
  abstract public void func1();

}
class concrete implements IPrinter,IScanner{
  public void func1()
  {
    System.out.println("Class function");
  }
  
}
public class Pract3_2{
  public static void main(String[] args) {
   Vector v= new Vector();
   concrete c[]= new concrete[5];
   for(int i=0;i<5;i++)
   {
    c[i]=new concrete();
    v.add(c[i]);
   }
  concrete cc1 = (concrete) v.get(0);
  cc1.func();
  cc1.func1();
  //  System.out.println(v);
  }
}
