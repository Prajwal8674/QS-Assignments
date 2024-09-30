package OOP.Inheritance.MultiLevel;

public class TCS extends SoftwareComp{
    String HQ;
    int employees;
    int project;
    String loc;

    TCS(){}

    TCS(String compName, String ceo, double turnOver, String type, String HQ, int employees, int project, String loc){
        this.ceo=ceo;
        this.turnOver=turnOver;
        this.compName=compName;
        this.type=type;
        this.HQ=HQ;
        this.employees=employees;
        this.project=project;
        this.loc=loc;
    }
    public void showTCSDetails(){
        System.out.println("HEADQUARTER         : "+HQ);
        System.out.println("TOTAL EMPLOYEES     : "+employees+"+");
        System.out.println("TOTAL PROJECTS DONE : "+project);
        System.out.println("COMPANY LOCATION    : "+loc);
    }
}
