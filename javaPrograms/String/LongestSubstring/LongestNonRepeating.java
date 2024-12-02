package String.LongestSubstring;
///incomplete

public class LongestNonRepeating {

    public static String nonRepeatingSubS( String str){

        int count = 0, max=0;
        int ch = ' ';
        String ans = "" ;
        for(int i =0 ; i < str.length()-1 ; i++){

            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                ch=str.charAt(i);
            }
            else{
               if(ch!=str.charAt(i)){
                   ans+=ch;
               }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        String str = "aabbcdeffghhhhhh";
        System.out.println(nonRepeatingSubS(str));

    }
}
