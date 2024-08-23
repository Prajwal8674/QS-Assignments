package UniquePrograms;

import java.util.Scanner;

public class NonPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Add First Number ");
        int start = sc.nextInt();
        System.out.println("Add Second Number ");
        int end = sc.nextInt();

        while (start <= end) {
            int den = 2;
            for (; den < start; den++) {
                if (start % den == 0) {
                    count++;
                    System.out.println("Non-Prime number : " + start);
                    break;
                }
            }
            start++;
        }
        System.out.println("Total non-prime numbers found: " + count);
    }
}
