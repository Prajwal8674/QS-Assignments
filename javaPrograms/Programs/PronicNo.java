package Programs;

import java.util.Scanner;

public class PronicNo {

    public static void main(String[] args) {
        int num;
        int n1=0;
        int n2=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        num=sc.nextInt();
        while(n1*n2<=num){
            n1=n2;
            n2++;

            if(n1*n2==num ){
                System.out.println(num+ " IS A PRONIC NUMBER ");
                break;
            }
        }
        if(n1*n2!=num){
            System.out.println(num+ " IS NOT PRONIC NUMBER");
        }
    }
}
