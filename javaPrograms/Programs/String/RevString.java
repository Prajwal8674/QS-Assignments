package Programs.String;

import java.util.Arrays;

public class RevString {
    public static void main(String[] args) {

        String str = "I LOVE PROGRAMMING";
        int count= 1 ;
        for (int i = 0 ; i<=str.length()-1; i++){

            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
        String[] strArr = new String[count];

        String ans = "";
        int index = 0;

        for(int i = 0 ; i< str.length()  ; i++){

            if(str.charAt(i)!=' '){
                ans+=str.charAt(i);
            }
            else {
                strArr[index]=ans;
                ans="";
                index++;
            }
        }
        strArr[index]=ans;
        System.out.println(Arrays.toString(strArr));
        ans="";

        for(int i = strArr.length-1; i>=0 ; i--){

            ans+=strArr[i]+" ";
        }
        System.out.println(ans);
    }
}
