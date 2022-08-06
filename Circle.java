public class Circle
{
    double R;
    final double pi=(double) 3.14;
    Circle()
    {
        R=1;
    }
    Circle(double R)
    {
        this.R=R;
    }
    double getArea()
    {
        return(pi*Math.pow(R,2));
    }
    double getPerimeter()
    {
        return(2*pi*R);
    }
}