package String.Conting;

public class CountOf {
    public static void main(String[] args) {

        String str = "Prajwal124$#";
        String str2=str;

        int upperCase=0;
        int lowerCase=0;
        int digits =0;
        int specialChar=0;

        for (int i = 0; i < str.length(); i++) {

            if ((int)str.charAt(i)>=128 || (int)str.charAt(i)<=47 ) {
                specialChar++;
            }
            else if ((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57) {
                digits++;
            }
        }

        String up =str.toUpperCase();
        String low= str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==up.charAt(i)){
                upperCase++;
            }
            if (str.charAt(i)==low.charAt(i)) {
                lowerCase++;
            }
        }

        System.out.println("STRING : "+str);
        System.out.println("TOTAL UPPERCASE : "+upperCase);
        System.out.println("TOTAL LOWERCASE : "+lowerCase);
        System.out.println("TOTAL DIGITS : "+digits);
        System.out.println("TOTAL SPECIAL CHARACTERS : "+specialChar);

    }
}
