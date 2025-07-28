package String.findDuplicateChar;
public class Solution {
    public static void findDuplicate(String str) {
        String dupChars = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+ 1; j < str.length()-1;j++) {
                if(str.charAt(i)!=str.charAt(j)){

                }
                else{
                    dupChars+=str.charAt(i);
                }
            }
        }
        System.out.println(dupChars);
    }
    public static void main(String[] args) {

        String original = "aaakbb";
        findDuplicate(original);
    }
}
