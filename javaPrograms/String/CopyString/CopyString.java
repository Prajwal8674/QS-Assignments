package String.CopyString;

public class CopyString {
    public static void main(String[] args) {

        String s1 = "PRAJWAL";
        String ans="";

        for(int i = 0 ; i<s1.length(); i++){
            ans+=s1.charAt(i);
        }
        System.out.println(ans);
    }
}
