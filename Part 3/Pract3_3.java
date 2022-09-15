/*
    NAME : KHUSHI GORIYA
    ID: 21CE035
 *  WAP that illustrate the interface inheritance Interface P is extended by P1 and P2 interfaces.1,2
 *  Interface P12 extends both P1 and P2. Each interface declares one method and one constant.
 *  Create one class that implements P12. By using the object of the class invokes each of its method and displays constant.
 */
interface P{
    int a0=0;
    abstract void f();
}

interface P1 extends P{
    int a1=1;
    abstract void f1();
}

interface P2{
    int a2=2;
    abstract void f2();
}

interface P12 extends P1, P2{
    int a12=12;
    abstract void f12();
}

class P3 implements P12{
    public void f(){
    System.out.println("Function f : "+a0);
}

    public void f1(){
        System.out.println("Function f1 : "+a1);
    }
    public void f2(){
        System.out.println("Function f2 : "+a2);
    }
    public void f12(){
        System.out.println("Function f12 : "+a12);
    }
}
public class Pract3_3 {
    public static void main(String[] args) {
        P3 p= new P3();
        p.f();
        p.f1();
        p.f2();
        p.f12();      
    }
}
