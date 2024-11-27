package String.ReplaceChar;

public class Replace {

    public static String replace(String str, char old,char newChar){

        String ans="";
        for(int i =0 ; i<str.length(); i++){

            if(str.charAt(i)==old){
                ans+=newChar;
            }else{
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(replace("HELLO",'H','M'));
    }
}
