package Programs.String;

import java.util.Arrays;

public class PrintRepeated {

    private static void printCounted(String str){

        char[] charArr = new char[str.length()/2];
        int[] numArr = new int[str.length()/2];

        int index = 0 ;
        int index2 = 0 ;

        for (int i = 0 ; i< str.length();i++){
            if(i%2==0){
                charArr[index++]=str.charAt(i);
            }else{
                numArr[index2++]=str.charAt(i)-'0';
            }
        }
        for(int i = 0; i < numArr.length ; i++){

            for(int j = 0 ; j < numArr[i] ; j++){

                System.out.print(charArr[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(numArr));

    }
    public static void main(String[] args) {
        String str = "b1c2a1A2";
        printCounted(str);
    }
}
