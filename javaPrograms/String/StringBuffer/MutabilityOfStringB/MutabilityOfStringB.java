package String.StringBuffer.MutabilityOfStringB;

public class MutabilityOfStringB {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = s1+" World";

        System.out.println(s1);
        System.out.println(s2);
        //this is happening because String is making another temporary object to store those data


        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = sb1.append(" World");

        System.out.println(sb1);
        System.out.println(sb2);

        //this is happening because StringBuffer is adding second object in first one itself
    }
}
