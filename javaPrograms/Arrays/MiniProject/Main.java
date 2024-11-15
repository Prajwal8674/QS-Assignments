package Arrays.MiniProject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] s1 =  new Student[10];
        s1[0]= new Student(1,"Prajwal",'M',"Hislop",73,2024);
        s1[1]= new Student(2,"Rishabh",'M',"Hislop",78,2025);
        s1[2]= new Student(3,"Gaurav",'M',"KDK",71,2024);
        s1[3]= new Student(4,"Aditya",'M',"Raisoni",90,2023);
        s1[4]= new Student(5,"Sakshi",'F',"KDK",93,2022);

        for (int i= 0 ; i < s1.length-1 ; i++){

            System.out.println(s1[i].toString());
        }

    }
}
