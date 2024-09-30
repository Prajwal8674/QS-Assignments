package OOP.IsA_Relationship;

public class Laptop {

    String brand="ASUS";
    String displayType="Amoled";
    int ram = 8;
    int storageGB=1024 ;
    Pendrive p1;
     void displayLaptop(){

         System.out.println("===LAPTOP===");
         System.out.println(brand);
         System.out.println(displayType);
         System.out.println(ram+" GB");
         System.out.println(storageGB+" GB");
         p1= new Pendrive("sandisk",32);
         p1.displayPendrive();

    }
}
