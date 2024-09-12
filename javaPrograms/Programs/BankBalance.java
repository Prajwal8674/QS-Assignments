package Programs;


public class BankBalance {
    static int balance = 10000;

    public static void deposit(int deposit){
        balance+=deposit;
        System.out.println(balance);
    }
    public static void withdraw(int withdraw){
        balance-=withdraw;
        System.out.println(balance);

    }
    public static void main(String[] args){
        int balance=100;
        System.out.println(BankBalance.balance);
        //withdraw(5000);
        //deposit(5000);
        //Demo.demo();
    }
}
class Demo{

    public static void demo(){
        System.out.println(BankBalance.balance);
    }
}
