package String.Decode;

public class DecodeString {


    public static String repeatChar(char ch, char digit){

        String ans = "";

        for(int i = 0 ; i < digit-48 ; i++){
            ans=ans+ch;
        }
        return ans;
    }
    public static String decode(String str){

        char[] ch = str.toCharArray();
        String ans = "";

        for(int i = 0 ; i < ch.length-1; i+=2){

            ans+=repeatChar(ch[i],ch[i+1]);
        }
        return ans;
    }
    public static void main(String[] args) {

        String str = "a5b4c3d2e1";
        System.out.println(decode(str));
    }
}
