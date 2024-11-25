package String.Conting;

public class CountOf {
    public static void main(String[] args) {

        String str = "Prajwal123";
        String up =str.toUpperCase();
        String low= str.toLowerCase();
        int upperCase=0;
        int lowerCase=0;
        int digits =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==up.charAt(i)){
                upperCase++;
            }
            else if (str.charAt(i)==low.charAt(i)) {
                lowerCase++;
            }
            else if (str.charAt(i)<10) {
                digits++;
            }
        }
        System.out.println("TOTAL UPPERCASE : "+upperCase);
        System.out.println("TOTAL LOWERCASE : "+lowerCase);
        System.out.println("TOTAL DIGITS : "+digits);
        System.out.println(up);
    }
}
