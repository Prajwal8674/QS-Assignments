public class HighestNumber {
    public static void main(String[] args) {

        int arr[]={3,4,1,6,7,8,52,10,42,12};
        int max=arr[0];

        for(int i = 0;i<arr.length;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
        }
        System.out.println(max);
    }
}
