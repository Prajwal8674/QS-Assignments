package Arrays;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int arr[]={1,5,3,7,34,89,5,23,45};
        int temp;
        for(int i = 0 ; i < arr.length-1 ; i++){

             for (int j = 0 ; j < arr.length-1 ; j++){

                 if(arr[j]>arr[j+1]){
                     temp = arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]= temp;
                 }
             }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Max : "+ arr[arr.length-2 ]);
    }
}
