public class Main {
    public static void main(String[] args) {

        SmartWatch sw1 = new SmartWatch();
        SmartWatch sw2 = new SmartWatch();
        SmartWatch sw3 = new SmartWatch();
        SmartWatch sw4 = new SmartWatch();
        SmartWatch sw5 = new SmartWatch();



        sw1.name="ColorFit Icon";
        sw1.brand="Noise";
        sw1.Display="Amoled";
        sw1.displaySize=1.8;
        sw1.strapColor="Black";
        sw1.callFunc=true;
        sw1.price=1399;

        System.out.println();
        System.out.println(sw1.brand+" | "+sw1.name);
        System.out.println("===================================");

        System.out.println("Product Name : "+sw1.name);
        System.out.println("Brand Name : "+sw1.brand);
        System.out.println("Display Type : "+sw1.Display);
        System.out.println("Display Size : "+sw1.displaySize);
        System.out.println("Strap Color : "+sw1.strapColor);
        System.out.println("Functionality : "+(sw1.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println("Price : "+sw1.price+"/- only");

        System.out.println("===================================");
        System.out.println();

        sw2.name="Drift BT";
        sw2.brand="Boult";
        sw2.Display="LCD";
        sw2.displaySize=1.7;
        sw2.strapColor="Brown";
        sw2.callFunc=true;
        sw2.price=1499;

        System.out.println();
        System.out.println(sw2.brand+" | "+sw2.name);
        System.out.println("===================================");
        System.out.println("Product Name : "+sw2.name);
        System.out.println("Brand Name : "+sw2.brand);
        System.out.println("Display Type : "+sw2.Display);
        System.out.println("Display Size : "+sw2.displaySize);
        System.out.println("Strap Color : "+sw2.strapColor);
        System.out.println("Functionality : "+(sw2.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println("Price : "+sw2.price+"/- only");
        System.out.println("===================================");
        System.out.println();


        sw3.name="Infinity";
        sw3.brand="Boston Levin";
        sw3.Display="Amoled";
        sw3.displaySize=1.85;
        sw3.strapColor="Black";
        sw3.callFunc=false;
        sw3.price=1199;

        System.out.println();
        System.out.println(sw3.brand+" | "+sw3.name);
        System.out.println("===================================");
        System.out.println("Product Name : "+sw3.name);
        System.out.println("Brand Name : "+sw3.brand);
        System.out.println("Display Type : "+sw3.Display);
        System.out.println("Display Size : "+sw3.displaySize);
        System.out.println("Strap Color : "+sw3.strapColor);
        System.out.println("Functionality : "+(sw3.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println("Price : "+sw3.price+"/- only");
        System.out.println("===================================");
        System.out.println();


        sw4.name="Revolt XR1";
        sw4.brand="Fastrack";
        sw4.Display="LCD";
        sw4.displaySize=1.7;
        sw4.strapColor="Black";
        sw4.callFunc=false;
        sw4.price=1099;

        System.out.println();
        System.out.println(sw4.brand+" | "+sw4.name);
        System.out.println("===================================");
        System.out.println("Product Name : "+sw4.name);
        System.out.println("Brand Name : "+sw4.brand);
        System.out.println("Display Type : "+sw4.Display);
        System.out.println("Display Size : "+sw4.displaySize);
        System.out.println("Strap Color : "+sw4.strapColor);
        System.out.println("Functionality : "+(sw4.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println("Price : "+sw4.price+"/- only");
        System.out.println("===================================");
        System.out.println();


        sw5.name="Smart 3";
        sw5.brand="Titan";
        sw5.Display="Amoled";
        sw5.displaySize=1.96;
        sw5.strapColor="green";
        sw5.callFunc=true;
        sw5.price=4995;

        System.out.println();
        System.out.println(sw5.brand+" | "+sw5.name);
        System.out.println("===================================");
        System.out.println("Product Name : "+sw5.name);
        System.out.println("Brand Name : "+sw5.brand);
        System.out.println("Display Type : "+sw5.Display);
        System.out.println("Display Size : "+sw5.displaySize);
        System.out.println("Strap Color : "+sw5.strapColor);
        System.out.println("Functionality : "+(sw5.callFunc==true?"With Calling Function ":"No Calling Function"));
        System.out.println("Price : "+sw5.price+"/- only");
        System.out.println("===================================");
        System.out.println();

    }
}