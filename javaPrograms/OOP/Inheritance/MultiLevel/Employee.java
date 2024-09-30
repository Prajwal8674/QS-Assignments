package OOP.Inheritance.MultiLevel;

public class Employee extends TCS{

    String empName;
    int id;
    double salary;
    String role;
    int exp;

    Employee(String compName, String ceo, double turnOver, String type,String HQ,int employees,int project,
             String loc,String empName,int id, double salary, String role, int exp){

        this.compName=compName;
        this.ceo=ceo;
        this.turnOver=turnOver;
        this.type=type;
        this.HQ=HQ;
        this.employees=employees;
        this.project=project;
        this.loc=loc;
        this.empName=empName;
        this.id=id;
        this.salary=salary;
        this.role=role;
        this.exp=exp;
    }

    void displayEmployeeDetail(){
        System.out.println("EMPLOYEE NAME       : "+empName);
        System.out.println("EMPLOYEE ID         : "+id);
        System.out.println("EMPLOYEE SALARY     : "+salary);
        System.out.println("EMPLOYEE ROLE       : "+role);
        System.out.println("EMPLOYEE EXPERIENCE : "+exp);
    }
    void displayAllDetails(){
        displaySoftwareComp();
        showTCSDetails();
        displayEmployeeDetail();
    }
}
