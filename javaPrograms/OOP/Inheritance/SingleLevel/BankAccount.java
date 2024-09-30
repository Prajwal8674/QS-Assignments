package OOP.Inheritance.SingleLevel;

public class BankAccount {
    String accName ;
    long accNo;
    String ifsc;
    String branch;

    BankAccount(){}

    BankAccount(String accName, long accNo, String ifsc, String branch){
        this.accName=accName;
        this.accNo=accNo;
        this.ifsc=ifsc;
        this.branch=branch;
    }
    void showBankDetail(){
        System.out.println(accName);
        System.out.println(accNo);
        System.out.println(ifsc);
        System.out.println(branch);
    }

}
