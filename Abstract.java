abstract class Shape
{
    public abstract void numberOfsides();
}

class Rectangle extends Shape
{
    public void numberOfsides()
    {
        System.out.println("The number of sides in a recatngle is 4.");
    }
}

class Triangle extends Shape
{
    public void numberOfsides()
    {
        System.out.println("The number of sides in a triangle is 3.");
    }
}

class Hexagon extends Shape
{
    public void numberOfsides()
    {
        System.out.println("The number of sides in a hexagon is 6."); 
    }
}

class Abstract
{
    public static void main(String[] args)
    {
    Shape sc1=new Rectangle();
    Shape sc2=new Triangle();
    Shape sc3=new Hexagon();
    sc1.numberOfsides(); 
    sc2.numberOfsides();  
    sc3.numberOfsides();   
    }
}
