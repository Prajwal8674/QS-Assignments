package String.LastCharOfWord;

public class LastCharOfEachWord {
    public static void main(String[] args) {

        String str = "HELLO WORLD";
        String ans2 = "";
        str += " ";

        for(int i = 0 ; i < str.length() ; i++){

            if(str.charAt(i)!=' '){
                ans2+=str.charAt(i);
            }else{
                System.out.print(ans2.charAt(ans2.length()-1));
                ans2="";
            }
        }
    }
}
