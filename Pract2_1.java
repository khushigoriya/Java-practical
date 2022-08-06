/* 
 *ID: 21CE035 
 *NAME: KHUSHI GORIYA
 * AIM: Design a class named Circle containing following attributes and behavior.
 * •Onedouble data field named radius. The default valueis1.
 * •A no-argumentconstructor that creates a default circle.
 * •A Single argument constructor that creates a Circle with the specified radius.
 * •A method named getArea() that returns area of the Circle.
 * •A method named getPerimeter() that returns perimeter of it.
 */
public class Pract2_1 {
    public static void main(String[] args) {
        Circle C = new Circle(2.354); 
        System.out.println("The Area of Circle is :" + C.getArea());
        System.out.println("The Perimeter of Circle is :" + C.getPerimeter());
    }

}
