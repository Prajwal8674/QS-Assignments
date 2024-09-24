package Programs;
import java.util.Scanner;

public class NeonNumber {
    public static int checkNeon(int num){
        int square = num*num;
        int remainder;
        int add=0;

        while(square>0){
            remainder=square%10;
            add+=remainder;
            square/=10;
        }
        if(num==add){
            return add;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num= sc.nextInt();

        if(checkNeon(num)==num){
            System.out.println("YES ! ITS NEON NUMBER");
        }else{
            System.out.println("NO ! ITS NOT A NEON NUMBER");
        }
    }
}
