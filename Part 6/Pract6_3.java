/*
 * NAME: KHUSHI GORIYA
 * ID: 21CE035
 * Write a program to increment the value of one variable by one and display it after one second using thread using sleep() method.
 */
class Pract6_3 implements Runnable {
public volatile int count = 0;

    public void run() {
        Thread current = Thread.currentThread();
        try {
            while (count < 21) {
                System.out.println(current.getName() + " count = " + count++);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread v = new Thread(new Pract6_3(), "Variable 1: ");
        try {
            v.start();
            System.out.println("Variable 1 alive? " + v.isAlive());
            v.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
