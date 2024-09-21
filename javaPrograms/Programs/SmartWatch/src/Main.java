public class Main {
    public static void main(String[] args) {

        SmartWatch sw1 = new SmartWatch();

        sw1.name="ColorFit Icon";
        sw1.brand="Noise";
        sw1.Display="Amoled";
        sw1.displaySize=1.8;
        sw1.strapColor="Black";
        sw1.callFunc=true;
        sw1.price=1399;

        System.out.println(sw1.name);
        System.out.println(sw1.brand);
        System.out.println(sw1.Display);
        System.out.println(sw1.displaySize);
        System.out.println(sw1.strapColor);
        System.out.println("Functionality : "+(sw1.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println(sw1.price+"/- only");

        SmartWatch sw2 = new SmartWatch();

        sw2.name="Drift BT";
        sw2.brand="Boult";
        sw2.Display="LCD";
        sw2.displaySize=1.7;
        sw2.strapColor="Brown";
        sw2.callFunc=true;
        sw2.price=1499;

        System.out.println(sw2.name);
        System.out.println(sw2.brand);
        System.out.println(sw2.Display);
        System.out.println(sw2.displaySize);
        System.out.println(sw2.strapColor);
        System.out.println("Functionality : "+(sw2.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println(sw2.price+"/- only");

        SmartWatch sw3 = new SmartWatch();

        sw3.name="Infinity";
        sw3.brand="Boston Levin";
        sw3.Display="Amoled";
        sw3.displaySize=1.85;
        sw3.strapColor="Black";
        sw3.callFunc=false;
        sw3.price=1199;

        System.out.println(sw3.name);
        System.out.println(sw3.brand);
        System.out.println(sw3.Display);
        System.out.println(sw3.displaySize +" inch");
        System.out.println(sw3.strapColor);
        System.out.println("Functionality : "+(sw3.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println(sw3.price+"/- only");

        SmartWatch sw4 = new SmartWatch();

        sw4.name="Revolt XR1";
        sw4.brand="Fastrack";
        sw4.Display="LCD";
        sw4.displaySize=1.7;
        sw4.strapColor="Black";
        sw4.callFunc=false;
        sw4.price=1099;

        System.out.println(sw4.name);
        System.out.println(sw4.brand);
        System.out.println(sw4.Display);
        System.out.println(sw4.displaySize +" inch");
        System.out.println(sw4.strapColor);
        System.out.println("Functionality : "+(sw4.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println(sw4.price+"/- only");

        SmartWatch sw5 = new SmartWatch();

        sw5.name="Smart 3";
        sw5.brand="Titan";
        sw5.Display="Amoled";
        sw5.displaySize=1.96;
        sw5.strapColor="green";
        sw5.callFunc=true;
        sw5.price=4995;

        System.out.println(sw5.name);
        System.out.println(sw5.brand);
        System.out.println(sw5.Display);
        System.out.println(sw5.displaySize +" inch");
        System.out.println(sw5.strapColor);
        System.out.println("Functionality : "+(sw5.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println(sw5.price+"/- only");

    }
}