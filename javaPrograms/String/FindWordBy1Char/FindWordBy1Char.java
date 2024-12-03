package String.FindWordBy1Char;

public class FindWordBy1Char {

    public static void main(String[] args) {

        String str = "java is very evsy";
        char ch = 'v';
        str+=" ";
        String ans ="";
        for(int i = 0 ; i < str.length(); i++){

           if(str.charAt(i)!=' '){
               ans+=str.charAt(i);
           }
           else{
               for (int j = 0; j < ans.length(); j++) {

                   if(ans.charAt(j)==ch){
                       System.out.println(ans);
                   }
               }
               ans = "";
           }
        }
    }
}
