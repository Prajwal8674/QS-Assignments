package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;


public class TwoPointerMerging {


    public static int[] findMedian(int[] arr1, int[] arr2){

        int[] ans = new int[arr1.length + arr2.length];

        int i=0,j=0,k=0;
        while(i< arr1.length && j< arr2.length){

            if(arr1[i]> arr2[j]){
                ans[k++]=arr2[j++];
            }
            else if (arr1[i]<arr2[j]) {
                ans[k++]=arr1[i++];
            }
        }
        while(i< arr1.length ){
            ans[k++]=arr1[i++];
        }
        while(j< arr2.length ){
            ans[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(ans));

        if(ans.length/2==0){

            double average= ((Array.getInt(ans,ans.length/2))+( Array.getInt(ans,ans.length/2-1)))/2 ;
            System.out.println(average);

        }else{

            double median = Array.getInt(ans,ans.length/2);
            System.out.println(median);
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};


        System.out.println(findMedian(arr1,arr2));
    }
}
