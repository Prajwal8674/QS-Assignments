package Programs;
import java.util.Scanner;

public class UniqueNo {

    public static void main(String[] args) {

        int r1, r2, number, num1, num2, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        number = sc.nextInt();

        num1 = number;
        num2 = number;

        while (num1 > 0)
        {
            r1 = num1 % 10;


            while (num2 > 0)
            {
                r2 = num2 % 10;

                if (r1 == r2)
                {
                    count++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if (count == 1)
        {
            System.out.println("UNIQUE");
        }
        else
        {
            System.out.println("NOT UNIQUE");
        }
    }
}
