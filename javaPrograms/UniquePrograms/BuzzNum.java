package UniquePrograms;

import java.util.Scanner;

public class BuzzNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int num = sc.nextInt();
         int num2 = num;
             num %= 10;

             if (num2 % 7 == 0 || num == 7) {
                 System.out.print("YES ! Its A Buzz Number");
             } else {
                 System.out.print("NO ! Its Not Buzz Number");
             }
    }
}
