package String.SeparateAlternateString;

public class SeparateAlternateString {

    public static void main(String[] args) {

        String s1 = "HELLO WORLD";

        for (int i = 0; i < s1.length(); i+=2) {
            System.out.println(s1.charAt(i));
        }
    }
}
