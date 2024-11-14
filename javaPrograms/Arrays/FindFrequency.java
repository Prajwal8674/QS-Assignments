package Arrays;

import java.util.Arrays;

public class FindFrequency {
    public static void main(String[] args) {

        int[] arr = {1,2,5,1,2,7,4};
        int num;
        int count=0;
        int[] arr2= new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
             num = arr[i];

            for(int j = 0 ; j < arr.length ; j++){

                if(num == arr[j]){
                    count++;
                    arr2[j]=count;

                }
            }

        }
        //System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
