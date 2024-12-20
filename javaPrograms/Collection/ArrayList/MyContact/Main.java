package Collection.ArrayList.MyContact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContactPage> db = new ArrayList<>();


        db.add(new ContactPage("Prajwal", 9234567890L,"patilprajwal@gmail.com","me"));
        db.add(new ContactPage("Rishabh",3214569780L,"rishabh00l@gmail.com","Friend"));
        db.add(new ContactPage("Mummy",7432167891L,"mummy1@gmail.com","Mummy"));
        db.add(new ContactPage("Rounak",876534821L,"patilrounak@gmail.com","Brother"));
        db.add(new ContactPage("Neha",7644930234L,"neha@gmail.com","Sister"));



        sortByName(db);

        for(ContactPage cp : db){
            System.out.println(cp);
        }

        Iterator<ContactPage> c = db.iterator();
        ListIterator<ContactPage> li = db.listIterator(db.size());


//        while(c.hasNext()){
//            System.out.println(c.next());
//        }
//        System.out.println();
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//        }


    }
    public static void sortByName(List<ContactPage> li){

        for(int i = 0 ; i< li.size()-1; i++){

            for(int j = 0 ; j< li.size()-i-1; j++){

                if(li.get(j).name.compareTo(li.get(j+1).name)>0){

                    ContactPage temp = li.get(j);
                    li.set(j,li.get(j+1));
                    li.set(j+1,temp);
                }

            }
        }

    }
}
