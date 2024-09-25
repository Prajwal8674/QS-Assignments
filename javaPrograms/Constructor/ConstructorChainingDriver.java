package Constructor;
class ConstructorChaining {

    String name;
    String loc;
    double sal;
    String gender;
    String bldGrp;

    ConstructorChaining (String name, String loc, double sal){
        this.name=name;
        this.loc=loc;
        this.sal=sal;
    }
    ConstructorChaining (String name, String loc, double sal, String gender){

        this(name,loc,sal);
        this.gender=gender;
    }
    ConstructorChaining (String name, String loc, double sal, String gender,String bldGrp){

        this(name,loc,sal,gender);
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
public class ConstructorChainingDriver {
    public static void main(String[] args) {

        ConstructorChaining ch1 = new ConstructorChaining("Prajwal","Pune",45000,"Male","O+");
        ch1.displayData();
    }
}
