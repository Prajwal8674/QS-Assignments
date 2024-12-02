package String.FindLengthCharecter;

public class FindSubString {
    public static void main(String[] args) {

        String str = "java is very eay";
        String ans="";
        for(int i = 0 ; i < str.length() ; i++){

            if(str.charAt(i)!=' '){
                ans=ans+str.charAt(i);
            }
            else{
                if(ans.length()==2){
                    System.out.println(ans);
                }
                ans="";
            }
        }
    }
}
