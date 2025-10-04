package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramUsingHashing {

    public static boolean checkAnagram(String str1, String str2){

        int[]  arr = new int[26];
        char[] ch = new char[26];
        char ch2 = 'a';
        for(int i = 0; i <= arr.length-1 ; i++){
            ch[i]=ch2;
            ch2++;
        }
        System.out.println(Arrays.toString(ch));

//        int strLen = str2.length()-1;
//        int i = 0;

        for(int i = 0 ; i <= str2.length()-1 ; i++){

            for(int j =0 ; j<= ch.length-1; j++){

                if(ch[j]==str1.charAt(i)){
                  arr[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        return false;
    }
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        checkAnagram(str1,str2);
    }
}
