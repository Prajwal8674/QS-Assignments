package Programs.String;

public class RevStringNotWord {
    public static void main(String[] args) {

        String str = "I love programming";
        str.trim();
        int count = 1 ;

        for(int i = 0 ; i < str.length() ; i++ ){

            if(str.charAt(i)==' '){
                count++;
            }
        }
        String array[] = new String[count];
        String ans = "";
        int index=0;
        for(int i = str.length()-1; i>=0 ; i--){

            if(str.charAt(i)!=' '){
                ans+=str.charAt(i);
            }
            else{
                array[index]=ans;
                index++;
                ans="";
            }
        }
        array[index]=ans;
        System.out.println(count);
       // System.out.println(Arrays.toString(array));
        ans= "";

        for(int i = array.length-1; i>=0 ; i--){

            ans+=array[i]+" ";
        }
        System.out.println(ans);
    }
}
