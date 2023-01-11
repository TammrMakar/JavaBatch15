package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("Please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("Your weight is "+weight+" lb");

        System.out.println("Are you hungry");
        boolean hungry= scan.nextBoolean();
        System.out.println("hungry "+hungry);

        System.out.println("Enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please enter your name");
        String name= scan.next();
        System.out.println("You name is "+name);

        scan.nextLine();
        System.out.println("Please enter you full name");
        String fullname= scan.nextLine();
        System.out.println("Your full name is "+fullname);
        scan.close();
    }
}
