package Programs;

public class Pallindrome {

    public static void main(String[] args) {
        int num=121;
        int org=num;
        int rev=0;

        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println(rev);
        System.out.println(org);
        if(org==rev){
            System.out.println("ITS A PALLINDROME");
        }else{
            System.out.println("ITS NOT A PALLINDROME");

        }
    }
}
