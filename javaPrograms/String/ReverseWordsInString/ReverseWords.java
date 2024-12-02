package String.ReverseWordsInString;

public class ReverseWords {
    public static int count(String str){

        int ct=0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==' '){
                ct++;
            }
        }
        return ct+1;
    }
    public static String reverse(String str){


        int ct = count(str);
        String[] ans = new String[ct];

        int j = ans.length-1;

        String ref="";
        for(int i = str.length()-1 ; i >=0 ; i--){
            if(str.charAt(i)!=' '){
                ref=ref+str.charAt(i);
            }
            else{
                ans[j]=ref;
                ref="";
                j--;
            }
        }
        ans[j]=ref;
        ref="";

        for(int i = 0 ; i < ans.length; i++ ){
            ref+=ans[i] + " ";
        }
        return ref;
    }
    public static void main(String[] args) {

        String str = "java is very easy";
        System.out.println(reverse(str));

    }
}
