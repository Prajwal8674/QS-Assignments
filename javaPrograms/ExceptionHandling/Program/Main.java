package ExceptionHandling.Program;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int a=0,b=0;
        System.out.println("EXCEPTION HANDLING");

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
        System.out.println("THANK YOU ");
        System.out.println(a+b);
    }
}
