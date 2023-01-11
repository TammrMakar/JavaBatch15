package Class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String country= scanner.next();

        /*System.out.println(country.toLowerCase());*/

        switch (country.toLowerCase()){

            case "usa":
                System.out.println("burgers");
                break;
            case "itlay":
                System.out.println("Pasta");
                break;
            case "Afghanistan":
            System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
    }
}
}