package ObjectClass.Laptop;

public class LaptopDriver {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("ASUS","TUF F15",72000,16,1);
        Laptop l2 = new Laptop("ASUS","TUF F15",72000,16,1);

        System.out.println(l1.equals(l2));


    }
}
