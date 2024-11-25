package String.ReverseCopyString;

public class reverseCopy {
    public static void main(String[] args) {

        String s1 = "PRAJWAL";
        String ans = "";

        for (int i = s1.length()-1; i >=0 ; i--) {
            ans+=s1.charAt(i);
        }
        System.out.println(ans);
    }
}
