package Programs;
import java.util.Scanner;

public class checkDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();


        System.out.println(i);
        System.out.println(d);
        System.out.println(s);


    }
}
