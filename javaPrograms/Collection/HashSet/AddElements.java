package Collection.HashSet;

import java.util.HashSet;

public class AddElements {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);

        System.out.println(hs);
    }
}
