package OOP.Inheritance.Hierachical;

public class Dog extends Animal {

    String name;
    String breed;
    int age;
    String voice;

    Dog() {
    }

    Dog(String habitat, String diet, String name, String breed, int age, String voice) {
        this.habitat = habitat;
        this.diet = diet;
        this.name = name;
        this.breed = breed;
        this.age = age;
    
    }
    public void displayDog(){

        dispayAnimal();
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(voice);
        System.out.println();

    }
}
