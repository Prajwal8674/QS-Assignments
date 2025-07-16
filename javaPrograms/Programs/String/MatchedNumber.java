package Programs.String;

public class MatchedNumber {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {9,2,5,3,1};

       for(int i = 0 ; i < arr1.length ;i++){

           for (int j = 0; j < arr2.length ; j++) {

               if(arr2[j]==arr1[i]){
                   System.out.println(arr2[j]);
                }
           }
       }
    }
}
