package Arrays;

import java.util.Arrays;

public class SortingAsc {

    public static void main(String[] args) {

        int arr[] ={2,4,6,0,8,1};
        int temp;
        for(int i =0 ; i< arr.length-1;i++){

            for(int j = 0;j< arr.length-1-i; j++){

                if(arr[j]>arr[j+1]){

                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
