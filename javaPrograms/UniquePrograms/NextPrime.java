package UniquePrograms;
import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int den=2;
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int num2= num ; ; ){
            for(; den<num2  ; den++ ){
                if(num2%den==0){
                    break;
                }
            }
            if(num2==den){
                System.out.println(num2);
                break;

            }else{
                num2++;
            }
        }
    }
}
