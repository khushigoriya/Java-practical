 /*
  * NAME : KHUSHI GORIYA
    ID: 21CE035
    Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area of both and display results.Design of all classes are given in the following UML diagram.
  */
import java.util.Scanner;

abstract class GeometricObject {
    String color;
    boolean filled;
    java.util.Date dateCreated;
    Scanner s= new Scanner(System.in);
    abstract double getPerimeter();
    abstract double getArea();
    protected GeometricObject()
    {
        color="";
    }
    protected GeometricObject(String color, boolean filled)
    { 
        this.color=color;
        this.filled=filled;
    }
    String getColor()
    {
        System.out.println("Enter colour: ");
        color=s.next();
        return color;
    }
    void  setColor(String color)
   {
    this.color=color;
   }
   boolean isFilled()
   {
        return filled;
   }
    public void setFilled(boolean filled) {
       this.filled = filled;
   }
   public java.util.Date getDateCreated() {
       return dateCreated;
   }   
}
class Circle extends GeometricObject
{
    Scanner s= new Scanner(System.in);
    double radius;
    Circle()
    { 
        radius=0;
    }
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
     double getRadius()
    {
        System.out.println("enter radius: ");
        radius=s.nextDouble();
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getPerimeter()
    {
        return this.radius*2*3.14;
    }
    double getArea()
    {
        return 3.14*this.radius*this.radius;
    }

}
class Rectangle extends GeometricObject
{
    Scanner s= new Scanner(System.in);
    double width;
    double height;
    Rectangle()
    { 
        width=0;
        height=0;
    }
    Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    Rectangle(double width, double height, String color, boolean filled)
    {
        this.width=width;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }

    double getWidth()
    {
        System.out.println("enter width: ");
        width=s.nextDouble();
        return width;
    }
    double getHeight()
    {
        System.out.println("enter height: ");
        height=s.nextDouble();
        return height;
    }
    void setWidth(double width)
    {
        this.width=width;
    }
    void setHeight(double height)
    {
        this.height=height;
    }
    double getPerimeter()
    {
        return 2*(width+height);
    }
    double getArea()
    {
        return width*height;
    }

    }
public class TestGeometricObject
    {
        public static void main(String[] args)
        {
            Circle c1=new Circle();
           // System.out.println(c1.getDateCreated());
            c1.setRadius(c1.getRadius());
            c1.setColor(c1.getColor());
            c1.setFilled(true);
            System.out.println( "\nFILLED: "+c1.isFilled());
            System.out.println("COLOUR: "+ c1.color);
            System.out.println("AREA: "+c1.getArea());
            System.out.println("PERIMETER: "+c1.getPerimeter()+"\n");
            Rectangle r1=new Rectangle();
            Rectangle r2=new Rectangle();
            r1.setWidth(r1.getWidth());
            r1.setHeight(r1.getHeight());
            r1.setColor( r1.getColor());
            r1.setFilled(true);
           System.out.println( "\nFILLED: "+r1.isFilled());
           System.out.println("COLOUR: "+ r1.color);
           System.out.println("AREA: "+r1.getArea());
           System.out.println("PERIMETER: "+r1.getPerimeter());
    }
}

