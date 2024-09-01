package Programs;
import java.util.Scanner;

public class SpecialTwoDigitNo {
    public static void checkSpecial(int num) {

        int rem=0;
      while(num>0){

          rem=num%10;
          System.out.println(rem);
          num=num/10;
      }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER THE NUMBER : ");
    int num = sc.nextInt();
    checkSpecial(num);
    }
}
