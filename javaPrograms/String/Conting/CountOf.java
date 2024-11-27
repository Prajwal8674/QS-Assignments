package String.Conting;

public class CountOf {
    public static void main(String[] args) {

        String str = "P1ra2j!w6al$";
        String str2=str;

        int upperCase=0;
        int lowerCase=0;
        int digits =0;
        int specialChar=0;


        for (int i = 0; i < str.length(); i++) {

            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                upperCase++;
            }
            else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                lowerCase++;
            }
            else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                digits++;
            }
            else{
                specialChar++;
            }
        }
        System.out.println("STRING                   : "+str);
        System.out.println("TOTAL UPPERCASE          : "+upperCase);
        System.out.println("TOTAL LOWERCASE          : "+lowerCase);
        System.out.println("TOTAL DIGITS             : "+digits);
        System.out.println("TOTAL SPECIAL CHARACTERS : "+specialChar);
    }
}
