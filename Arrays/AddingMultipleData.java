import java.util.Scanner;

public class AddingMultipleData {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        System.out.println("Enter The Size : ");
        n=sc.nextInt();

        int arr[] =  new int[n];

        System.out.println("Enter The Elements : ");
        for(int i=0 ; i<n ; i++ ){
           arr[i]= sc.nextInt();
        }

        for(int i=0 ; i<n ; i++ ){
            System.out.println(arr[i]);
        }

    }
}
