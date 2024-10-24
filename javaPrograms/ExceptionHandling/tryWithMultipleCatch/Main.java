package ExceptionHandling.tryWithMultipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a=0,b=0;

        try {
            System.out.print("NUMERATOR : ");
            a = sc.nextInt();
            System.out.print("DENOMINATOR :");
            b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException ae){
            System.out.println("YOU CAN'T DIVIDE NUMBER BY 0");
        }
        catch (NullPointerException npe){
            System.out.println("VALUE IS NULL");
        }
        catch(InputMismatchException ime){
            System.out.println("ENTER VALID VALUE  : " + ime);
        }
        catch(Exception e){
            System.out.println("THERE IS AN EXCEPTION : " + e);
        }
        System.out.println("THANK YOU ");
        System.out.println(a+b);

    }
}
