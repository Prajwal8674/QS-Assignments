package String.Pallidrome;

public class Soution {
    public static boolean checkPallindrome(String str){

        for(int i = 0 ,j=str.length()-1 ; i< str.length()/2 ; i++ ,j--){
          if(str.charAt(i)!=str.charAt(j)){
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String str = "abab";
        boolean decision = checkPallindrome(str);
        if(!decision){
            System.out.println("String Is Not Pallindrome");
        }else{
            System.out.println("String Is Pallindrome");
        }
    }
}
