package String.SortString;

import java.util.Arrays;
public class SortString {


    public static void main(String[] args) {

        String str = "abdcs";
        char[] str2 = new char[str.length()];

        char temp;
        for(int i = 0 ; i < str.length() ; i++){
            str2[i]= str.charAt(i);
        }
        for(int i = 0 ; i < str2.length-1 ; i++){

            for(int j = 0 ; j < str2.length-1 ; j++){

                if(str2[j]>str2[j+1]){
                    temp= str2[j];
                    str2[j]=str2[j+1];
                    str2[j+1]=temp;
                }
            }
        }
        str = new String(str2);
        System.out.println(Arrays.toString(str2));
        System.out.println(str);
    }
}
