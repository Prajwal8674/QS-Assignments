package UniquePrograms;
import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start Point : ");
        int start = sc.nextInt();

        System.out.println("Enter End Point : ");
        int end = sc.nextInt();


        int temp1=start;
        start++;

        while(start<=end)
        {
            int den=2;

            for(;den<start;den++)
             {
                if(start%den==0)
                {
                    break;
                 }

                    }
                    if(start==den)
                    {
                    if(start-temp1<=2)
                 {
                    System.out.println(temp1+","+start);
                      }
                     temp1=start;
                    }
                    start++;
                    }
                    }
                        }
