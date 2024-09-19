import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int secondMax=0;
        int arr[]={1,10,10,9,2,3,6,4,5};

        Arrays.sort(arr);
        //System.out.println(arr[arr.length-2]);

        secondMax=arr.length-2;
        System.out.println(arr[secondMax]);

    }
}
