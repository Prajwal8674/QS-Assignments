public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(21,"Prajwal",30,30000.00,"Pune");


        Employee e2 = new Employee();
        e2.setName("Prajwal");
        e2.setAge(21);
        e2.setLocation("pune");
        e2.setSalary(30000.00);
        System.out.println(e2.getEmpID());
        System.out.println(e2.getName());
        System.out.println(e2.getAge());
        System.out.println(e2.getLocation());
        System.out.println(e2.getSalary());

    }
}