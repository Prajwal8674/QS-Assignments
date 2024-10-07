package OOP.Tyepecasting.Downcasting;

public class Main {
    public static void main(String[] args) {
        Child c1 = (Child) new Father();
        c1.Sing();
        c1.dance();
    }
}
