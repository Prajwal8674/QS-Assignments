package OOP.abstraction;

public class Main {
    public static void main(String[] args) {
        CalculatorImp1 c1 = new CalculatorImp1();

        c1.addition(10,20);
        c1.subtraction(20,10);
        c1.multiplication(10,20);
        c1.division(5,10);

        c1.messageFromParent();
        //c1.message2(); //compile time error
    }
}
