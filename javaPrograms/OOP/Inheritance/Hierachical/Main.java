package OOP.Inheritance.Hierachical;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Pet","carnivore","Blacky","Persian",3,"Meow Meow");
        c1.displayCat();
        Dog d1 = new Dog("Pet","carnivore","Simba","Rottweiler",5,"Bow Bow");
        d1.displayDog();
    }
}
