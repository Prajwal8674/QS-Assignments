package Programs;

public class Fibonacce {
    public static void fibo(int num) {
        int count=2;
        int a=0,b=1,c;
        System.out.print(" "+a);
        System.out.print(" "+b);

        while(count<num){
            c=a+b;

            System.out.print(" "+c);
            a=b;
            b=c;
            ++count;
        }
    }
    public static void main(String[] args) {

        fibo(10);
    }
}
