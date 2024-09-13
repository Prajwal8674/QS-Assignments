package Programs;

public class GreatestAmong3 {
    public static void main(String[] args) {

        int a= 10;
        int b=20;
        int c=30;

        int greater=a>b?a:b;
        int greatest=greater>c?greater:c;

        System.out.println("a : "+a+" b : "+b+" c : "+c);
        System.out.println("Greatest of them is : "+greatest);
    }
}
