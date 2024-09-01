package Programs;
import java.util.Scanner;
public class PrimeNo {
    public static void checkPrime(int num){
       int den=2;
       for(;num>den;den++){
           if(num%den==0){
               break;
           }
       }
        if(num==den){
            System.out.println("YES ! "+ num + " IS A PRIME NUMBER");
        }else{
            System.out.println("NO ! "+ num + " IS NOT A PRIME NUMBER");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num= sc.nextInt();
        checkPrime(num);
    }
}