package String.FirstCharOfEachWord;

import java.util.Arrays;

public class FirstCharOfEach {

    public static void main(String[] args) {

        String str = "RISHABH NAMDEORAO UMREDKAR";

        String ans = ""+str.charAt(0);
        char[] ch= new char[str.length()];

        for(int i = 0 ; i < str.length() ; i++){
           ch[i]=str.charAt(i);
        }
        for(int i = 0 ; i < str.length() ; i++){

            if(ch[i]==' '){
                ans+=ch[i+1];
            }

        }
        System.out.println(ans);
    }
}
