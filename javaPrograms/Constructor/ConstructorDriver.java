package Constructor;


class Constructor {

    String name;
    String loc;
    double sal;
    String gender;
    String bldGrp;

    Constructor(){

    }
    Constructor(String name, String loc, double sal){
        this.name=name;
        this.loc=loc;
        this.sal=sal;
    }
    Constructor(String name, String loc, double sal, String gender){

        this.name=name;
        this.loc=loc;
        this.sal=sal;
        this.gender=gender;
    }
    Constructor(String name, String loc, double sal, String gender,String bldGrp){

        this.name=name;
        this.loc=loc;
        this.sal=sal;
        this.gender=gender;
        this.bldGrp=bldGrp;
    }
    void displayData(){
        System.out.println(name);
        System.out.println(loc);
        System.out.println(sal);
        System.out.println(gender);
        System.out.println(bldGrp);
        System.out.println("==============");
    }
}
public class ConstructorDriver {

    public static void main(String[] args) {

        Constructor c1 =new Constructor();
        c1.displayData();
        Constructor c2 = new Constructor("Prajwal","Pune",45000);
        c2.displayData();
        Constructor c3=new Constructor("Rishabh","Pune",45000,"Male");
        c3.displayData();
        Constructor c4 = new Constructor("Prajwal","Pune",45000,"Male","O+");
        c4.displayData();
    }
}
