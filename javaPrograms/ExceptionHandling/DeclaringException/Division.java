package ExceptionHandling.DeclaringException;

public class Division {

    public void division(int numerator, int denominator){

       try{
           System.out.println(numerator/denominator);
       }catch (ArithmeticException ae){
           System.out.println("EXCEPTION HANDLED");
       }

       {

        }
    }
}
