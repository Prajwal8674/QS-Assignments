package Arrays.out.production.Arrays;

public class AddNoInArray {
    public static void main(String[] args) {
        int[] arr = {12,34,56};
        int num=0;
        int total =0;
        for(int i = 0 ; i < arr.length ; i++){
            num =arr[i];

            for(int j = 0 ; num!=0 ; j++){
                total+=num%10;
                num=num/10;
            }
        }
        System.out.println(total);
    }
}
