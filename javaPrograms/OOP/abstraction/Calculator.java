package OOP.abstraction;

public abstract class Calculator {

    public abstract void addition(int a, int b);
    public abstract void subtraction(int a, int b);
    public abstract void multiplication(int a, int b);
    public abstract void division(double a, double b);

    public void messageFromParent(){
        System.out.println("Hello world!!");
    }

}
