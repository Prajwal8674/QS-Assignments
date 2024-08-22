package UniquePrograms;

import java.util.Scanner;

public class BuzzNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int num = sc.nextInt();

         while(true){

             num = num%10;
             if(num%7==0){
                 System.out.print("YES ! Its A Buzz Number");
             }
             else{
                 System.out.print("NO ! Its Not Buzz Number");
             }
             break;
         }
    }
}
