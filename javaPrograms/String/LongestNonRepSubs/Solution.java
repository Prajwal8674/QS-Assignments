package String.LongestNonRepSubs;

public class Solution {
    public static void nonRepeatingSS(String str) {

        String conc = "";
        for (int i = 0; i < str.length(); i++) {
            int index= 0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)!=str.charAt(j)){
                    conc+=str.charAt(i);
                    break;
                }
            }
        }
        System.out.println(conc);
    }
    public static void main(String[] args) {

        String str = "pwk";
        nonRepeatingSS(str);
    }
}
