package String.comparetoMethod;

public class CompareString {

    public static int compareString(String str1, String str2){

        try {
            for(int i =0 ; i < str1.length() && i < str2.length(); i++){

                if(str1.charAt(i)<str2.charAt(i)){
                    return 1;
                }
                else if(str1.charAt(i)>str2.charAt(i)){
                    return -1;
                }
            }
            return str1.length()>str2.length()?1:str1.length()==str2.length()?0:1;
        }
        catch (NullPointerException e){

            System.out.println("can't compare with null");
            return 0;
        }

    }
    public static void main(String[] args) {

        String str1 = "Abc";
        String str2 = "Abc";

        System.out.println(compareString(str1,str2));

        System.out.println("AB".compareTo("BC"));
    }
}
