package Collection.ArrayList;

import java.util.ArrayList;

public class Arlst {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hello1");
        list.add("hello2");

        /*

       for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if(value.length()%2==0){
                System.out.println(value);
            }
       } */
        for(String value : list){
            if(value.length()%2==0){
                System.out.println(value);
            }
        }
    }
}
