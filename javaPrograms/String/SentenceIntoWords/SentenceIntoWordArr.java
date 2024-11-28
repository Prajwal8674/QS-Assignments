package String.SentenceIntoWords;

import java.util.Arrays;

public class SentenceIntoWordArr {

    public static int countWords(String sent) {

        int ct = 0 ;
        for(int i = 0 ; i < sent.length() ; i++){

            if(sent.charAt(i)==' '){
                ct++;
            }
        }
        return ct+1;
    }
    public static String[] stringToWords(String sent){

        int ct = countWords(sent);
        String[] words = new String[ct];

        String ans = "" ;
        int j = 0;
        for(int i = 0; i < sent.length() ; i++){

            if(sent.charAt(i)!=' '){

                ans+=sent.charAt(i);

            }else{
                words[j]=ans;
                j++;
                ans = " ";
            }
        }
        words[j]=ans;
        return words;
    }
    public static void main(String[] args) {

        String str = "Bharat is my country";
        String[] ans = stringToWords(str);
        System.out.println(Arrays.toString(ans));
    }
}
