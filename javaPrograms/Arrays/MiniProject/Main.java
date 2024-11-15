package Arrays.MiniProject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int temp;
        Student[] s1 =  new Student[6];
        s1[0]= new Student(1,"Prajwal",21, 'M',"Hislop",73,2024);
        s1[1]= new Student(2,"Rishabh",22,'M',"Hislop",78,2025);
        s1[2]= new Student(3,"Gaurav",22,'M',"KDK",71,2024);
        s1[3]= new Student(4,"Aditya",23,'M',"Raisoni",90,2023);
        s1[4]= new Student(5,"Sakshi",23,'F',"KDK",93,2022);

        for (int i= 0 ; i < s1.length-1 ; i++){
            System.out.println(s1[i].toString());

        }
        System.out.println();
        System.out.println("1 >> SEARCH BY ID");
        System.out.println("2 >> SORT BY AGE");
        System.out.println("3 >> SORT BY MARKS");
        System.out.print("       CHOOSE ONE OF THE OPTION ABOVE : ");
        int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("       SEARCH BY ID");
                break;
            case 2:
                System.out.println("       SORT BY AGE");

                for(int i = 0 ; i < s1.length-1 ; i++){
                    s1[i].displayData();
                }
               // System.out.println(Arrays.toString(s1));
                break;
            case 3:
                System.out.println("       SORT BY PERCENTAGE");
                break;
            default:
                System.out.println("         CHECK INPUT AGAIN !");
        }
    }
}
