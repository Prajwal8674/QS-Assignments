package Programs;


public class ArmstrongNo {

    public static void pow(int num){

        int rem=0;
        int count=0;
        for (;num!=0;){
           rem=num%10;
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        int num=153;
        pow(num);

    }
}
