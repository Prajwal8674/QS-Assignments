public class Employee {

    private int empId=1;
    private String name;
    private int age;
    private double salary;
    private String location;

    public Employee(){

    }

    public Employee(int empId, String name, int age, double salary, String location){

        this.empId=empId;
        this.age=age;
        this.name=name;
        this.location=location;
        this.salary=salary;
    }
    public void displayData(){
        System.out.println(empId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(location);
        System.out.println(salary);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public double getSalary() {
        return salary;
    }
    public int getEmpID() {
        return empId;
    }

}
