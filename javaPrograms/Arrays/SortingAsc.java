import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAsc {
    public static void main(String[] args) {

        int arr[]={6,4,7,8,4,9,9,2};
        int temp ;
        for(int i=0; i< arr.length; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i] ;
                    arr[i] =  arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println(arr[1]);
    }
}
