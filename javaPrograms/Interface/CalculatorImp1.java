package Interface;

public class CalculatorImp1 implements  Calculator{

   public void areaOfCircle(int radius){
        System.out.println(pi*radius+radius);
    }
    public void areaOfSquare(int side){
        System.out.println(side*side);
    }
    public void areaOfRectangle(int length, int breadth){
        System.out.println(2*length+breadth);
    }
    public void areaOfTriangle(double base, double height){
        System.out.println(0.5*base*height);

    }
}
