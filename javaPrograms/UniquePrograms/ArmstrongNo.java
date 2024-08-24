package UniquePrograms;

public class ArmstrongNo {
    public static void main(String[] args) {

        int num = 14635653;
        int count=0;
        int sum=0;
int temp=num;

        while(num>0){
            count=num%10;
            sum=sum+(count*count*count);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("armstrong  number");
        }else{
            System.out.println("not armstrong  number");
        }
    }
}
