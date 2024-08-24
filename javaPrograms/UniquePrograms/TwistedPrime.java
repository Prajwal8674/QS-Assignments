package UniquePrograms;

import java.util.Scanner;

public class TwistedPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int den=2;
        System.out.println("ENTER THE NUMBER :");
        int num = sc.nextInt();

        for (; den<num;den++){

            if(num%2==0){
                break;
            }
        }
        if(num==den){
            System.out.println("YES ITS PRIME");

            int reverse = 0;
            while(num!=0){

                int remainder = num%10;

                reverse = reverse * 10 + remainder;
                num = num/10;

            }
            System.out.println("The reverse of the given number is: " + reverse);

            for(;den<reverse;den++)
            {
                if(reverse%2==0){
                    break;
                }
            }
            if(reverse==den) {
                System.out.println("YES ITS TWISTED PRIME");
            }
            else{
                System.out.println("NO ! ITS NOT A TWISTED PRIME");
            }

        }
        else{
            System.out.println("NO ! ITS NOT A PRIME");
        }
    }
}
