package Programs.String;

import java.util.Arrays;

public class FrequencyOfCharectors {

    public static void countChars(String str){

        System.out.println(str);

        int[] charArr = new int[str.length()];

        for(int i = 0 ; i< charArr.length;i++){
            charArr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(charArr));
        int count = 0 ;

        for(int i = 0 ;  i<str.length(); i++){

            for(int j = 0 ; j< charArr.length ;j++){

                if(str.charAt(i)==charArr[j]){
                    count++;
                    charArr[j]=-1;
                }
            }
            if(count!=0){
                System.out.println(str.charAt(i)+ " : " + count);
                count=0;
            }
        }
    }
    public static void main(String[] args) {

        String str = "programming";
        countChars(str);
    }
}


