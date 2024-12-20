package Collection.ArrayList.User;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        ArrayList<UserDetails> al = new ArrayList<>();

        al.add(new UserDetails(1,"Prajwal",2000));
        al.add(new UserDetails(2,"Rishabh",700));
        al.add(new UserDetails(3,"Suraj",1000));
        al.add(new UserDetails(4,"Deepak",500));
        al.add(new UserDetails(5,"Mamta",1500));

        Collections.sort(al);
        System.out.println(al);

    }
}
