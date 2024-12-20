package Collection.ArrayList.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class main {

    public static void main(String[] args) {

        ArrayList<Student> db = new ArrayList<>();

        db.add(new Student("prajwal",80.0f,2024,"Commerce"));
        db.add(new Student("Deepak",69.0f,2020,"BSC"));
        db.add(new Student("Rishabh",34.0f,2024,"CSE"));
        db.add(new Student("Suraj",90.0f,2024,"CSE"));


        removeFailed(db);
        freshersOnly(db);

        Iterator<Student> itr = db.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void removeFailed(List<Student> db){

        ListIterator<Student> li = db.listIterator();

       while(li.hasNext()){
           if(li.next().perc<35){
               li.remove();
           }
       }

    }
    public static void freshersOnly(List<Student> db) {

    }
}
