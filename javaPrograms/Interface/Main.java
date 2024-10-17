package Interface;

public class Main {
    public static void main(String[] args) {

        CalculatorImp1 c1 = new CalculatorImp1();
        c1.areaOfCircle(10);
        c1.areaOfSquare(10);
        c1.areaOfRectangle(10,10);
        c1.areaOfTriangle(10,10);
        c1.message();
    }
}
