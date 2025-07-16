package Programs.String;

import java.util.Arrays;

public class AddItself {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5};
        int[] ans = new int[arr.length];
        System.out.println();
        ans[0]=arr[0];

        for(int i = 0 ; i < arr.length ; i++){

            for (int j =i+1 ; j< arr.length ; j++){
                ans[j]=ans[i]+arr[j];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
