package String.SortWords;
import String.SentenceIntoWords.SentenceIntoWordArr;

public class SortWords {

    public static String sortWords(String str){

        String[] words = SentenceIntoWordArr.stringToWords(str);

        for(int i = 0 ; i < words.length-1 ; i++){

            for (int j = 0; j < words.length-1-i; j++) {

                if(words[j].compareTo(words[j+1])>0){

                    String temp = words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        String ans = "";
        for(int i = 0 ; i < words.length; i++){

            if(i < words.length-1){

                ans=ans+words[i]+" ";
            }
            else{
                ans+=words[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        String str = "I love my bharat";
        System.out.println(sortWords(str));
    }
}
