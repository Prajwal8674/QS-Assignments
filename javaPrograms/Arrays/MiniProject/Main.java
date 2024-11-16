package Arrays.MiniProject;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Manipulation m1 = new Manipulation();
        Student[] s1 =  new Student[5];
        s1[0]= new Student(3,"Prajwal",25, 'M',"Hislop",73,2024);
        s1[1]= new Student(1,"Rishabh",21,'M',"Hislop",78,2025);
        s1[2]= new Student(2,"Gaurav",24,'M',"KDK",71,2024);
        s1[3]= new Student(5,"Aditya",23,'M',"Raisoni",90,2023);
        s1[4]= new Student(4,"Sakshi",22,'F',"KDK",93,2022);


        System.out.println();
        System.out.println("1 >> SEARCH BY ID");
        System.out.println("2 >> SORT BY AGE");
        System.out.println("3 >> SORT BY MARKS");
        System.out.print("       CHOOSE ONE OF THE OPTION ABOVE : ");
        int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("       SEARCH BY ID");
                System.out.println("       ENTER THE ID : ");
                int findId = sc.nextInt();
                m1.sortById(s1);

                m1.searchById(s1, s1.length, findId);

                break;
            case 2:
                System.out.println("       SORT BY AGE");
               m1.sortByAge(s1);
               System.out.println(Arrays.toString(s1));
                break;
            case 3:
                System.out.println("       SORT BY PERCENTAGE");
                m1.sortBypercent(s1);
                break;
            default:
                System.out.println("         CHECK INPUT AGAIN !");
        }
    }
}
