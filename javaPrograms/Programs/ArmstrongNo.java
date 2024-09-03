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

        int rem;
        int finalNo=0;
int add = 1;
        System.out.println("ENTER THE NUMBER : ");
        int num=sc.nextInt();
        int count=pow(num);
        //System.out.println(count);
        //System.out.println(num);

        for(;num!=0;){
            rem=num%10;

            for(add=rem;add<=count;){
            add*=rem;
            finalNo+=add;
                System.out.println(finalNo);
            }
            //System.out.println(rem);
            num=num/10;
        }

       // System.out.println(rem);
        System.out.println(finalNo);
    }
    public static void main(String[] args) {

        checkArmstrong();

    }
}
