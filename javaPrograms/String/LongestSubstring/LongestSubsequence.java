package String.LongestSubstring;
public class LongestSubsequence {

    public static String longestSubString(String str){

        int count = 0 , max =0;
        char ch=0;
        int i;
        String ans = "";

        for(i = 0 ; i < str.length()-1 ; i++){

            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                if(count+1>max){
                     max = count+1;
                    ch = str.charAt(i);
                }
                count=0;
            }
        }
        if(count+1>max){
            max=count+1;
            ch = str.charAt(i);
        }
        for(int k = 0 ; k<max ; k++){
            ans+=ch;
        }

        return ans;
    }


    public static void main(String[] args) {
        String str = "aabbcdeffghhhhhh";

        System.out.println(longestSubString(str));
    }
}
