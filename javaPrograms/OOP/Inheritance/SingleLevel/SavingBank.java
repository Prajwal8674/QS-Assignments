package OOP.Inheritance.SingleLevel;

public class SavingBank extends BankAccount{

    double balance;
    String type;
    double roi;
    String name;

    SavingBank(String name,String accName, long accNo, String ifsc, String branch,double balance, String type, double roi){
        this.name=name;
        this.accName=accName;
        this.accNo=accNo;
        this.ifsc=ifsc;
        this.branch=branch;
        this.balance=balance;
        this.type=type;
        this.roi=roi;
    }

    public void savingBank(){
        System.out.println(name);
        System.out.println(accNo);
        System.out.println(ifsc);
        System.out.println(branch);
        System.out.println(balance);
        System.out.println(type);
        System.out.println(roi);
    }
}
