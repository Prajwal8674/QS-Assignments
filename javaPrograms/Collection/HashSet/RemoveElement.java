package Collection.HashSet;

import java.util.HashSet;

public class RemoveElement {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(15);
        hs.add(16);

        System.out.println(hs);
        hs.remove(13);
        System.out.println(hs);

    }
}
