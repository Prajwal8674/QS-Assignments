package String.RemoveOccurance;
//incomplete
public class RemoveOccurance {

    public static void main(String[] args) {

        String str = "ABBCDEF";

        char[] chArr= new char[str.length()];
        int[] count = new int[str.length()];

        for(int i = 0 ; i < chArr.length ; i++){

            int ct=1;
            if(count[i]!=1){

                for(int j = i+1 ; j < chArr.length ; j++){
                   if(chArr[i]==chArr[j]){
                      ct++;
                      count[j]=-1;
                   }
                }
                count[i]=ct;
            }
        }
        String ans = "";
        for(int i = 0 ; i < chArr.length ; i++){
            if(count[i]!=1){
              ans+=count[i];
            }
        }
        System.out.println(ans);
    }
}
