abstract class Shape
{
    abstract void numberOfSides();
}

class Rectangle extends Shape 
{
    public void numberOfSides()
    {
        System.out.println("Number of sides of a rectangle: 4");
    }
}
class Triangle extends Shape 
{
    public void numberOfSides() 
    {
        System.out.println("Number of sides of triangle: 3");
    }
}
class Hexagon extends Shape 
{
    public void numberOfSides() 
    {
        System.out.println("Number of sides of hexagon: 6");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}
