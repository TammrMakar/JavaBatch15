package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'F':
                System.out.println("female");
            case 'f':
                System.out.println("female");
                break;
            case 'M':
            case'm':
                System.out.println("male");
                break;
            default:
                System.out.println("not specified");
        }
    }




    }
