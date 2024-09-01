package Programs;
import java.util.Scanner;

public class SpecialTwoDigitNo {
    public static void checkSpecial(int num) {
        int sum=num;
        int rem=0;
        int add=0;
        int product=1;
      while(num>0){
          rem=num%10;

          num=num/10;
          add+=rem;
          product*=rem;
      }
        System.out.println("THE SUM OF THE DIGITS : "+add);
        System.out.println("THE PRODUCT OF THE DIGITS : "+product);

        if(add+product==sum){
            System.out.println("THIS IS SPECIAL TWO DIGIT NUMBER !!");
        }else{
            System.out.println("THIS IS NOT A SPECIAL TWO DIGIT NUMBER !!");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE NUMBER : ");
    int num = sc.nextInt();
    checkSpecial(num);
    }
}
