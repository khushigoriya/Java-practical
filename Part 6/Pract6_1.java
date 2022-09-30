/**
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to create thread which display “Hello World” message.
    A. by extending Thread class
    B. by using Runnable interface.
 */
class mythread extends Thread{
    public void run()
    {
        System.out.println("Hello World");
    }
}

public class Pract6_1 implements Runnable{
    public void run()
    {
        System.out.println("Hello World");
    }
    public static void main(String args[])
    {
        mythread obj= new mythread();
        obj.start();
        Pract6_1 th= new Pract6_1();
        Thread t1= new Thread(th);
        t1.start();
    }
}