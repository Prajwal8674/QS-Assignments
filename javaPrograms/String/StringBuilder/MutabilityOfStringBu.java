package String.StringBuilder;

public class MutabilityOfStringBu {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Bharat");
        StringBuilder sb2 = sb1.append(" Is My Country");

        System.out.println(sb1);
        System.out.println(sb2);
    }
}
