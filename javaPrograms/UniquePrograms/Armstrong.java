package UniquePrograms;

public class Armstrong {
    public static void main(String[] args) {

        int num=153;
        int count=0;

        for (int i = num; i!=0; i/=10){
            count++;
        }
        int sum = 0;

        for(int i = num; i!=0; i/=10){
        int last=i%10;
        int pow=1;



        for(int j = 0; j<count; j++){
            pow=pow*last;
            sum=sum+pow;
        }

        }
        if(sum==num){
            System.out.println("its armstrong");
        }else {
            System.out.println("its not armstrong");
        }


    }
}
