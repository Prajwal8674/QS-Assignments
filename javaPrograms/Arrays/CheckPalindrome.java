package Arrays;

public class CheckPalindrome {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,1};
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            if(arr[a]==arr[b]){
                a++;
                b--;
            }
            else{
                System.out.println("Not Palindrome");
            }
        }

    }
}
