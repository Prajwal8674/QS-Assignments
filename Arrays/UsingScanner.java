import java.util.Scanner;

public class UsingScanner {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter The Size of Array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println(array.length);

    }
}
