package OOP.Tyepecasting.Downcasting;

public class Child extends Father{
    public void Sing(){
        System.out.println("Can Sing");
    }
    // if I override

    public void dance() {
        System.out.println("Can Dance without song");
    }
}
