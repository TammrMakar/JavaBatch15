package Class33;

import org.apache.poi.examples.xssf.usermodel.ScatterChart;

public class ExceptionDemo2 {
    public static void main(String[] args) {



        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");
        try{
            //here we put the code which might throw an error
           //System.out.println(10 / 0);
            String str="Java";
            str.charAt(10);
            //String name=null;
            //System.out.println(name.length());
        }catch(NullPointerException npe){
            System.out.println("We are trying to access a method on a null object ");
        }catch (ArithmeticException e){
            System.out.println("Some one is trying to divide by 0");
        }
            catch(Exception e){
                System.out.println("Something went wrong ");
            }
        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");



    }
}
