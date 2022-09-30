/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7.
 */
class Pract6_4 extends Thread {

    public void run() {
        // Print statement
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        Pract6_4 t1 = new Pract6_4();
        Pract6_4 t2 = new Pract6_4();
        Pract6_4 t3 = new Pract6_4();
        System.out.println("t1 thread priority : "+ t1.getPriority());

        System.out.println("t2 thread priority : "+ t2.getPriority());
        System.out.println("t3 thread priority : "+ t3.getPriority());                
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println("t1 thread priority : "+ t1.getPriority());
        System.out.println("t2 thread priority : "+ t2.getPriority());
        System.out.println("t3 thread priority : "+ t3.getPriority());
        System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}

