package Programs;

public class BouncyNo {
 
    public static boolean checkBouncy(int num){
        boolean prev=false;
        boolean next=false;

        int previous = num%10;
        num/=10;

        //12
        while(num>0){

            int current = num%10;

            if(previous < current){
                prev=true;
            }
            if(previous > current) {
                next = true;
            }
            if(prev && next){
                return true;
            }
            previous = current;
            num/=10;
        }
         return false;


    }
    public static void main(String[] args) {

        int num=12435;
        System.out.println(checkBouncy(num));
    }
}
