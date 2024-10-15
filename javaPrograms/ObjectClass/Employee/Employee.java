package ObjectClass.Employee;

public class Employee {
    int id;
    String name;
    String loc;
    int salary;

    public Employee(){}

    public Employee(int id, String name, String loc, int salary){
        this.id= id;
        this.name=name;
        this.loc=loc;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return " [ " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", loc= '" + loc + '\'' +
                ", salary= " + salary +
                " ]";
    }

    @Override
    public boolean equals(Object obj) {
        Employee e1 = (Employee) obj;

        if(this.id==e1.id && this.name== e1.name && this.loc== e1.loc && this.salary== e1.salary){
            return true;
        }
        return false;
    }
    public int hashCode(){
       int hc = id+name.hashCode()+loc.hashCode();
       return hc;
    }
}
