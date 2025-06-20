package Programs;
import java.util.Scanner;

public class NthPrime {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("ENTER THE NUMBER : ");
           int num = sc.nextInt();
           int start=1, count=0;
           while (count < num) {
               int den=2;
               start+=1;
               while(den<=start){
                   if (start % den == 0){
                       break;
                   }
                   den++;
               }
               if (den == start) {
                   count = count+1;
               }
           }
           System.out.println("POSITIONED PRIME NUMBER : "+start);
       }
}
