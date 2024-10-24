package ExceptionHandling.tryWithFinally;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a=0,b=0;

        try {
            System.out.print("NUMERATOR : ");
            a = sc.nextInt();
            System.out.print("DENOMINATOR :");
            b = sc.nextInt();
            System.out.println(a / b);
        }
//        catch(ArithmeticException ae){
//            System.out.println(ae);
//        }
//        finally {
//            System.out.println(a+b);
//        }
        catch (ArithmeticException ae){
            System.out.println("YOU CAN'T DIVIDE NUMBER BY 0");
        }
        catch (NullPointerException npe){
            System.out.println("VALUE IS NULL");
        }
        catch(InputMismatchException ime){

            sc = new Scanner(System.in) ;
            System.out.println("ENTER VALID VALUE  : " + ime);
        }
        catch(Exception e){
            System.out.println("THERE IS AN EXCEPTION : " + e);
        }
        finally {

            try{

                System.out.println("ENTER THE NUMERATOR : ");
                int aa = sc.nextInt();
                System.out.println("ENTER DENOMINATOR : " );
                int bb = sc.nextInt();
                System.out.println(aa/bb);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            catch (InputMismatchException ip){



                System.out.println(ip);
            }
        }

        System.out.println("THANK YOU ");
        System.out.println(a+b);


    }
}
