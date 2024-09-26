public class OddEven {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<arr.length;i++){
            int even=arr[i];
            if(even%2==0){
                System.out.println("Even : "+even);
            }
        }
        System.out.println();

        for(int i=0; i<arr.length;i++) {
            int odd = arr[i];
            if (odd % 2 != 0) {
                System.out.println("Odd : " + odd);
            }
        }

    }
}
