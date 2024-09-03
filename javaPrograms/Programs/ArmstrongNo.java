package Programs;


import java.util.Scanner;

public class ArmstrongNo {

    public static int pow(int num){

        int rem=0;
        int count=0;
        for (;num!=0;){
           rem=num%10;
            num=num/10;
            count++;
        }
        return count;
    }
    public static void checkArmstrong(){

        Scanner sc = new Scanner(System.in);
        System.out.println(pow(153));
        //System.out.println("ENTER THE NUMBER : ");


    }
    public static void main(String[] args) {

       // int num=153;
        checkArmstrong();

    }
}
