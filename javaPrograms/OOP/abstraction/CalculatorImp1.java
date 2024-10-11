package OOP.abstraction;

public class CalculatorImp1 extends Calculator{

    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public void subtraction(int a, int b){
        System.out.println(a-b);
    }
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public void division(double a, double b){
        System.out.println(a/b);
    }
    public void messageFromChild(){
        System.out.println("Hello world!!");
    }

}
