package OOP.Inheritance.Hierachical;

public class Cat extends Animal{
    String name;
    String breed;
    int age;
    String voice;

    Cat(){}

    Cat(String habitat, String diet,String name,String breed, int age,String voice){
        this.habitat=habitat;
        this.diet=diet;
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.voice=voice;
    }
    public void displayCat(){
        dispayAnimal();
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(voice);
        System.out.println();

    }
}
