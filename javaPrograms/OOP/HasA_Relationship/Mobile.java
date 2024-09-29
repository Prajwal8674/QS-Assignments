package OOP.HasA_Relationship;
public class Mobile {

    String model;
    String brand;
    double price;
    int cam;
    String processor;
    int ram;
    int Storage;
    Battery b1 = new Battery();

    public void displayBattery(){
        System.out.println(b1.brand);
        System.out.println(b1.capacity+" mAH");
        System.out.println(b1.life+" YEARS");
    }

}
