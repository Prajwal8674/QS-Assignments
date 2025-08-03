package Programs;

public class TotalBottles {

    public static void main(String[] args) {

        int diviser = 3;
        int n = 10;
        int answer= n;
        int reminder=0;
        int dividend=0;

       while(n>=3){
           dividend = n/diviser;
           reminder = n%diviser;
           n=reminder+dividend;
           answer+=dividend;
       }
        System.out.println(answer);
    }
}

