package Class5;

public class LogicalOperators {
    public static void main(String[] args) {


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(false || true | false | false);

        boolean boughtcho = true;
        boolean boughtflowres = false;
        if (boughtcho || boughtflowres) {
            System.out.println("I'm happy");
        } else {
            System.out.println("I'm not");
        }
         boolean wifi=false;
        boolean fiveg=true;

        if(wifi||fiveg){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or 5G");
        }
    }
}
