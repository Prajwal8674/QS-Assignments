package ObjectClass.Laptop;

public class Laptop {

    String brand;
    String  name;
    int price;
    int ram;
    int storage;

   public Laptop(){}

    public Laptop( String brand, String  name, int price, int ram, int storage){
       this.brand=brand;
       this.name=name;
       this.price=price;
       this.ram=ram;
       this.storage=storage;
    }

    @Override
    public boolean equals(Object obj) {
       Laptop l = (Laptop) obj;
       if(this.brand==l.brand && this.name==l.name &&this.price==l.price &&
               this.ram==l.ram &&this.storage==l.storage){
          return true;
       }
        return false;
    }
}
