package WrapperClass.Unboxing;

public class Unboxing {
    public static void main(String[] args) {

        byte b = 1;     //BYTE
        Byte B = new Byte(b);
        byte b1 = B.byteValue();
        System.out.println(b1);

        short s = 10 ;      //SHORT
        Short S = new Short(s);
        short s1=S.shortValue();
        System.out.println(s1);

        Integer I = new Integer(100);
        int i = I.intValue();
        System.out.println(i);

        Boolean BB = new Boolean(true);
        boolean bb1 =  BB.booleanValue();
        System.out.println(bb1);
    }
}
