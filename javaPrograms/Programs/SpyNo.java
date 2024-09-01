package Programs;

public class SpyNo {

    public static void checkSpy(int num) {
        int last=0;
        int sum=0;
        int product=1;

        while(num>0){
            last=num%10;
            System.out.println(last);
            num/=10;
            sum+=last;
            product*=last;
        }
        System.out.println("THE SUM OF THE DIGIT IS : "+sum);
        System.out.println("THE PRODUCT OF THE DIGIT IS : "+product);
        if(sum==product){
            System.out.println("THIS IS SPY NUMBER ! ");
        }else{
            System.out.println("THIS IS NOT SPY NUMBER ! ");
        }
    }
    public static void main(String[] args) {
         checkSpy(22);
    }
}
