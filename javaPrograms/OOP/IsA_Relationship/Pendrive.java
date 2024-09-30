package OOP.IsA_Relationship;

public class Pendrive {

    String brand;
    int storageGB;

    void displayPendrive(){
        System.out.println("===PENDRIVE===");
        System.out.println(brand);
        System.out.println(storageGB+" GB");
    }

    Pendrive(String brand, int storageGB){
        this.brand=brand;
        this.storageGB=storageGB;
    }

}
