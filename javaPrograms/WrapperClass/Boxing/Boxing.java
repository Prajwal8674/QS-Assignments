package WrapperClass.Boxing;

public class Boxing{
    public static void main(String[] args) {

        char c = 'A';       //CHARACTER
        Character C = new Character(c);
        System.out.println(C);

        byte b = 1;        //BYTE
        Byte B = new Byte(b);
        System.out.println(B);

        short s = 10 ;      //SHORT
        Short S = new Short(s);
        System.out.println(S);

        int i =  100;        //INTEGER
        Integer I = new Integer(i);
        System.out.println(I);

        long l = 1000;      //LONG
        Long L = new Long(l);
        System.out.println(L);

        float f = 1000.0f;        //FLOAT
        Float F = new Float(f);
        System.out.println(F);

        double d = 100.0;       //DOUBLE
        Double D = new Double(d);
        System.out.println(D);
    }
}
