package ObjectClass.Employee;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Prajwal","pune",40000);
        System.out.println(e1.toString());
        Employee e2 = new Employee(1,"Prajwal","pune",40000);
        System.out.println(e2.toString());

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

//        System.out.println(e1.name.getClass().getName()+"@"+Integer.toHexString(e1.hashCode()));
//        System.out.println(e2.name.getClass().getName()+"@"+Integer.toHexString(e2.hashCode()));

        String emp1 = e1.name.getClass().getName()+"@"+Integer.toHexString(e1.hashCode());
        String emp2 = e2.name.getClass().getName()+"@"+Integer.toHexString(e2.hashCode());

        if(emp1.equals(emp2))
        {
            System.out.println("The Employee is duplicate");
        }

    }
}
