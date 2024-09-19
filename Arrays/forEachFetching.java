import java.util.Scanner;

public class forEachFetching {
public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int arr[] = new int[5];

        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;

        int total=0;

        for (int i : arr){
            System.out.println(i+"th index");
            total+=i;
        }
        System.out.println(total);
    }
}
