package UniquePrograms;

import java.util.Scanner;

public class PrimeRange {
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
                    break;
                }
            }

            if (den == start && start > 1) {
                count++;
                System.out.println("Prime number: " + start);
            }
            start++;
        }

        System.out.println("Count: " + count);
    }
}
