package String.SearchChar;

import java.util.Scanner;

public class SearchChar {
    public static final Scanner sc = new Scanner(System.in);

    public static int searchChar(String str,char ch){

        char[] charArr = new char[str.length()];

        for(int i = 0 ; i < charArr.length ; i++){
            charArr[i]=str.charAt(i);

            if(ch==charArr[i]){
                return str.indexOf(ch);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String str = "prajwal";

        System.out.println("ENTER THE CHAR : ");
        char ch = sc.next().charAt(0);

        System.out.println("STRING : "+str);
        System.out.println("INDEX OF GIVEN CHARACTER : "+searchChar(str,ch));
    }
}
