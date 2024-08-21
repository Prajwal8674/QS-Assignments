package UniquePrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int den=2;
        System.out.println("Enter the number");
        int num=sc.nextInt();


        for(; den<num  ; den++ ){

          if(num%den==0){
              break;
          }
        }
if(num==den){
    System.out.println("its a prime number");

}else{
    System.out.println("not a prime");

}
    }
}
