package OOP.Inheritance.MultiLevel;

public class SoftwareComp {

    String compName;
    String ceo;
    double turnOver;
    String type;

    SoftwareComp(){}

    SoftwareComp(String compName, String ceo, double turnOver, String type){
        this.compName=compName;
        this.ceo=ceo;
        this.turnOver=turnOver;
        this.type=type;
    }

    void displaySoftwareComp(){
        System.out.println("COMPANY NAME        : "+compName);
        System.out.println("COMPANY CEO         : "+ceo);
        System.out.println("COMPANY TURNOVER    : "+turnOver+" trillion");
        System.out.println("COMPANY TYPE        : "+type);
    }
}
