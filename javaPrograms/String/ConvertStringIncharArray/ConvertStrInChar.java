package String.ConvertStringIncharArray;

import java.util.Arrays;

public class ConvertStrInChar {
    public static void main(String[] args) {
        String str = "PRAJWAL";
        char[] ans = new char[str.length()];

        for(int i = 0 ; i < ans.length ; i++ ){
            ans[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
