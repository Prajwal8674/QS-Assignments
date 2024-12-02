package String.Anagram;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2){

        char[] ch1=new char[str1.length()];
        char[] ch2=new char[str2.length()];


        if(str1.length()==str2.length())
        {

            for (int i = 0; i < ch1.length ; i++)
            {
                ch1[i]=str1.charAt(i);
                ch2[i]=str2.charAt(i);
            }

            for(int i = 0 ; i < ch1.length-1 ; i++)
            {

                for(int j = 0 ; j < ch1.length-1-i ; j++){

                    if(ch1[j]>ch1[j+1]){
                        char temp = ch1[j];
                        ch1[j]=ch1[j+1];
                        ch1[j+1]=temp;
                    }
                    if(ch2[j]>ch2[j+1]){
                        char temp = ch2[j];
                        ch2[j]=ch2[j+1];
                        ch2[j+1]=temp;
                    }
                }
            }
            for(int i = 0 ; i < ch1.length ; i++){

                if (ch1[i]!=ch2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String str1 ="silent";
        String str2 = "listen";

        System.out.println(checkAnagram(str1,str2));
    }
}
