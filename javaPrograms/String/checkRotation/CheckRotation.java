package String.checkRotation;

public class CheckRotation {

    public static boolean checkRotation(String str1, String str2){
        String str3 = str1+str1;
        int k = 1;
        for(int i = 0 ; i< str3.length();i++){

            for(int j = 0; j < str1.length(); j++){
                
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str1= "abcd";
        String str2="dabc";
        System.out.println(checkRotation(str1,str2));
    }
}
