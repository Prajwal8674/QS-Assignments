package UniquePrograms;

import java.util.Scanner;

public class NivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        int num2=num;
        int digit,digit2=0;
                while(num>0){
                 digit=num%10;
                    if(digit==digit){
                        num = num / 10;
                        digit2+=digit;
                    }
                }
                System.out.println(digit2+ ": ADDITION OF DIGITS");
                if(digit2%9==0){
                    System.out.println(num2+" : IT'S NIVEN NUMBER");
                }
                else{
                    System.out.println(num2+" : IT'S NIVEN NUMBER");
                }
    }
}
