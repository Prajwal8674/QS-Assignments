package OOP.Tyepecasting.Downcasting;

public class Main {

    public static void main(String[] args) {
        Father f1 = new Child();
        Child c1 =(Child) f1;
        c1.dance();
        c1.Sing();
        
    }
}
